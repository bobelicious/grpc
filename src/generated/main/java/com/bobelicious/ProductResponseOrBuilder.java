// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product-service.proto

package com.bobelicious;

public interface ProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.bobelicious.ProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>int32 quantity_in_stock = 4;</code>
   * @return The quantityInStock.
   */
  int getQuantityInStock();
}
