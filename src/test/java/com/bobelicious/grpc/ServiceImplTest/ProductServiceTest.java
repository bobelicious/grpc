package com.bobelicious.grpc.ServiceImplTest;

import java.util.List;
import java.util.Optional;

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
import com.bobelicious.grpc.exceptions.AlreadyExistsExeception;
import com.bobelicious.grpc.exceptions.NotFoundException;
import com.bobelicious.grpc.repository.ProductRepository;
import com.bobelicious.grpc.service.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Test
    public void createProduct() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.save(Mockito.any())).thenReturn(product);
        ProductInputDTO inputDTO = new ProductInputDTO("product name", 22.50, 1);
        ProductOutputDTO outputDTO = productServiceImpl.create(inputDTO);

        Assertions.assertThat(outputDTO)
                .usingRecursiveComparison()
                .isEqualTo(outputDTO);
    }

    @Test
    public void createProductException() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.findByNameIgnoreCase(Mockito.any())).thenReturn(Optional.of(product));
        ProductInputDTO inputDTO = new ProductInputDTO("product name", 22.50, 1);

        Assertions.assertThatExceptionOfType(AlreadyExistsExeception.class)
                .isThrownBy(() -> productServiceImpl.create(inputDTO));
    }


    @Test
    public void findById() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.of(product));
        ProductOutputDTO outputDTO = productServiceImpl.findById(product.getId());

        Assertions.assertThat(outputDTO)
                .usingRecursiveComparison()
                .isEqualTo(product);
    }

    @Test
    public void findByIdException() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.empty());

        Assertions.assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> productServiceImpl.findById(product.getId()));
    }

    @Test
    public void deleteById() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.of(product));
        Assertions.assertThatNoException().isThrownBy(() -> productServiceImpl.delete(product.getId()));
    }

    @Test
    public void deleteByIdException() {
        var product = new Product(1L, "productname", 22.50, 1);

        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.empty());

        Assertions.assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> productServiceImpl.delete(product.getId()));
    }

    @Test
    public void findAll() {
        var products = List.of(
            new Product(1L, "productname A", 22.50, 1),
            new Product(2L, "productname B", 22.50, 1)
        );

        Mockito.when(productRepository.findAll()).thenReturn(products);
        List<ProductOutputDTO> outputDTO = productServiceImpl.findAll();

        Assertions.assertThat(outputDTO)
                .usingRecursiveComparison()
                .isEqualTo(products);
    }
}
