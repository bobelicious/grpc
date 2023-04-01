package com.bobelicious.grpc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobelicious.grpc.domain.Product;

public interface ProductRepository extends JpaRepository< Product,Long> {
    Optional<Product> findByNameIgnoreCase(String name);
}
