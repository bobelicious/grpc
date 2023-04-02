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

    public ProductOutputDTO(Product x) {
        this.id = x.getId();
        this.name = x.getName();
        this.price = x.getPrice();
        this.quantityInStock = x.getQuantityInStock();
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
