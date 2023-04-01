package com.bobelicious.grpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobelicious.grpc.domain.Product;
import com.bobelicious.grpc.dto.ProductInputDTO;
import com.bobelicious.grpc.dto.ProductOutputDTO;
import com.bobelicious.grpc.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private  ProductRepository productRepository;

    @Override
    public ProductOutputDTO create(ProductInputDTO inputDTO) {
        var product = new Product(inputDTO);
        return new ProductOutputDTO( productRepository.save(product));
    }

    @Override
    public ProductOutputDTO findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
