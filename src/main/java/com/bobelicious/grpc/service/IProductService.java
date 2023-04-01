package com.bobelicious.grpc.service;

import java.util.List;
import com.bobelicious.grpc.dto.ProductInputDTO;
import com.bobelicious.grpc.dto.ProductOutputDTO;

public interface IProductService {
   ProductOutputDTO create(ProductInputDTO inputDTO);

   ProductOutputDTO findById (Long id);

   void delete (Long id);

   List <ProductOutputDTO> findAll();
}
