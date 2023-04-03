package com.bobelicious.grpc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobelicious.grpc.domain.Product;
import com.bobelicious.grpc.dto.ProductInputDTO;
import com.bobelicious.grpc.dto.ProductOutputDTO;
import com.bobelicious.grpc.exceptions.AlreadyExistsExeception;
import com.bobelicious.grpc.exceptions.NotFoundException;
import com.bobelicious.grpc.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductOutputDTO create(ProductInputDTO inputDTO) {
        checkDuplicity(inputDTO.getName());
        var product = new Product(inputDTO);
        return new ProductOutputDTO(productRepository.save(product));
    }

    @Override
    public ProductOutputDTO findById(Long id) {
        var product = productRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
        return new  ProductOutputDTO(product);
    }

    @Override
    public void delete(Long id) {
        var product = productRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
        productRepository.delete(product);
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        var products = productRepository.findAll();
        return products.stream().map( x-> new ProductOutputDTO(x)).collect(Collectors.toList());
    }

    private void checkDuplicity(String name) {
        productRepository.findByNameIgnoreCase(name).ifPresent(e -> {
            throw new AlreadyExistsExeception(name);
        });
    }
}
