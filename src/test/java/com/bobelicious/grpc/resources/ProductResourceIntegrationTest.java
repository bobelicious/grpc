package com.bobelicious.grpc.resources;

import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

import com.bobelicious.DeleteRequest;
import com.bobelicious.EmptyRequest;
import com.bobelicious.FindByIdRequest;
import com.bobelicious.ProductRequest;
import com.bobelicious.ProductResponseList;
import com.bobelicious.ProductServiceGrpc;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@DirtiesContext
public class ProductResourceIntegrationTest {
    @GrpcClient("inProcess")
    private ProductServiceGrpc.ProductServiceBlockingStub serviceBlockingStub;

    @Autowired
    private Flyway flyway;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();
    }

    @Test
    public void createProductSuccessTest() {
        var productRequest = ProductRequest.newBuilder()
                .setName("product name")
                .setPrice(25.50)
                .setQuantityInStock(1)
                .build();

        var productResponse = serviceBlockingStub.create(productRequest);

        Assertions.assertThat(productRequest)
                .usingRecursiveComparison()
                .comparingOnlyFields("name", "price", "quantity_in_stock")
                .isEqualTo(productResponse);
    }

    @Test
    public void createProductAlreadyExistExceptionTest() {
        var productRequest = ProductRequest.newBuilder()
                .setName("Product A")
                .setPrice(10.99)
                .setQuantityInStock(10)
                .build();

        Assertions.assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> serviceBlockingStub.create(productRequest))
                .withMessage("ALREADY_EXISTS: Produto Product A já cadastrado no sistema.");

    }

    @Test
    public void findByIdSuccessTest() {
        var productRequest = FindByIdRequest.newBuilder().setId(1L).build();

        var productResponse = serviceBlockingStub.findById(productRequest);

        Assertions.assertThat(productResponse.getId())
                .isEqualTo(productRequest.getId());
    }

    @Test
    public void findByIdNotFoundExceptionTest() {
        var productRequest = FindByIdRequest.newBuilder().setId(100L).build();

        Assertions.assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> serviceBlockingStub.findById(productRequest))
                .withMessage("NOT_FOUND: Produto com ID 100 nao encontrado no sistema.");

    }

    @Test
    public void deleteByIdSuccessTest() {
        var productRequest = DeleteRequest.newBuilder().setId(1L).build();

        Assertions.assertThatNoException().isThrownBy(() -> serviceBlockingStub.delete(productRequest));
    }

    @Test
    public void deleteByIdNotFoundExceptionTest() {
        var productRequest = DeleteRequest.newBuilder().setId(100L).build();

        Assertions.assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> serviceBlockingStub.delete(productRequest))
                .withMessage("NOT_FOUND: Produto com ID 100 nao encontrado no sistema.");

    }

    @Test
    public void findAllTest() {
        var request = EmptyRequest.newBuilder().build();

        var responseList = serviceBlockingStub.findAll(request);

        Assertions.assertThat(responseList).isInstanceOf(ProductResponseList.class);
        Assertions.assertThat(responseList.getProductsCount()).isEqualTo(2);
        Assertions.assertThat(responseList.getProductsList()).extracting("id", "name", "price", "quantityInStock")
                .contains(
                        Tuple.tuple(1L, "Product A", 10.99, 10),
                        Tuple.tuple(2L, "Product B", 10.99, 10));
    }
}
