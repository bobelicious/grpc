package com.bobelicious.grpc.controler;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.bobelicious.DeleteRequest;
import com.bobelicious.EmptyRequest;
import com.bobelicious.EmptyResponse;
import com.bobelicious.FindByIdRequest;
import com.bobelicious.ProductRequest;
import com.bobelicious.ProductResponse;
import com.bobelicious.ProductResponseList;
import com.bobelicious.ProductServiceGrpc.ProductServiceImplBase;
import com.bobelicious.grpc.dto.ProductInputDTO;
import com.bobelicious.grpc.dto.ProductOutputDTO;
import com.bobelicious.grpc.service.IProductService;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProductResource extends ProductServiceImplBase {

    @Autowired
    private IProductService productService;

    @Override
    public void create(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        var inputDTO = new ProductInputDTO(
                request.getName(),
                request.getPrice(),
                request.getQuantityInStock());

        ProductOutputDTO outputDTO = this.productService.create(inputDTO);

        ProductResponse response = ProductResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(FindByIdRequest request, StreamObserver<ProductResponse> responseObserver) {
        var outputDTO = productService.findById(request.getId());
        var response = ProductResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .setQuantityInStock(outputDTO.getQuantityInStock())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override
    public void delete(DeleteRequest request, StreamObserver<EmptyResponse> responseObserver) {
        productService.delete(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(EmptyRequest request, StreamObserver<ProductResponseList> responseObserver) {
        var outputDTO =  productService.findAll();
        var response = outputDTO.stream().map(product ->
            ProductResponse.newBuilder()
                .setId(product.getId())
                .setName(product.getName())
                .setPrice(product.getPrice())
                .setQuantityInStock(product.getQuantityInStock())
                .build()
        ).collect(Collectors.toList());

        var productResponse = ProductResponseList.newBuilder().addAllProducts(response).build();
        responseObserver.onNext(productResponse);
        responseObserver.onCompleted();
    }
}