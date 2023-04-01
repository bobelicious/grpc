package com.bobelicious.grpc.ServiceImplTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bobelicious.grpc.domain.Product;
import com.bobelicious.grpc.dto.ProductInputDTO;
import com.bobelicious.grpc.dto.ProductOutputDTO;
import com.bobelicious.grpc.repository.ProductRepository;
import com.bobelicious.grpc.service.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Test
    public void createProduct(){
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.save(Mockito.any())).thenReturn(product);
        ProductInputDTO inputDTO = new ProductInputDTO("product name", 22.50, 1);
       ProductOutputDTO outputDTO =  productServiceImpl.create(inputDTO);

       Assertions.assertThat(outputDTO)
            .usingRecursiveComparison()
            .isEqualTo(outputDTO);
    }
}
