package com.bobelicious.grpc.controler;

import org.springframework.beans.factory.annotation.Autowired;

import com.bobelicious.ProductRequest;
import com.bobelicious.ProductResponse;
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

}
