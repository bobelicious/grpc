package com.bobelicious.grpc.dto;

import com.bobelicious.grpc.domain.Product;

public class ProductOutputDTO {
    private final Long id;
    private final String name;
    private final Double price;
    private final Integer quantityInStock;


    public ProductOutputDTO(Long id,String name, Double price, Integer quantityInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public ProductOutputDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.quantityInStock = product.getQuantityInStock();
    }


    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }


    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public Long getId() {
        return id;
    }

}
