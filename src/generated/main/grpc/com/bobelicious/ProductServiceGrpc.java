package com.bobelicious;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: product-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "com.bobelicious.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bobelicious.ProductRequest,
      com.bobelicious.ProductResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.bobelicious.ProductRequest.class,
      responseType = com.bobelicious.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bobelicious.ProductRequest,
      com.bobelicious.ProductResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.bobelicious.ProductRequest, com.bobelicious.ProductResponse> getCreateMethod;
    if ((getCreateMethod = ProductServiceGrpc.getCreateMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateMethod = ProductServiceGrpc.getCreateMethod) == null) {
          ProductServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.bobelicious.ProductRequest, com.bobelicious.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bobelicious.FindByIdRequest,
      com.bobelicious.ProductResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = com.bobelicious.FindByIdRequest.class,
      responseType = com.bobelicious.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bobelicious.FindByIdRequest,
      com.bobelicious.ProductResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.bobelicious.FindByIdRequest, com.bobelicious.ProductResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ProductServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindByIdMethod = ProductServiceGrpc.getFindByIdMethod) == null) {
          ProductServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.bobelicious.FindByIdRequest, com.bobelicious.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bobelicious.DeleteRequest,
      com.bobelicious.ProductResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.bobelicious.DeleteRequest.class,
      responseType = com.bobelicious.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bobelicious.DeleteRequest,
      com.bobelicious.ProductResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.bobelicious.DeleteRequest, com.bobelicious.ProductResponse> getDeleteMethod;
    if ((getDeleteMethod = ProductServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteMethod = ProductServiceGrpc.getDeleteMethod) == null) {
          ProductServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.bobelicious.DeleteRequest, com.bobelicious.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bobelicious.EmptyRequest,
      com.bobelicious.ProductResponseList> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = com.bobelicious.EmptyRequest.class,
      responseType = com.bobelicious.ProductResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bobelicious.EmptyRequest,
      com.bobelicious.ProductResponseList> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.bobelicious.EmptyRequest, com.bobelicious.ProductResponseList> getFindAllMethod;
    if ((getFindAllMethod = ProductServiceGrpc.getFindAllMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindAllMethod = ProductServiceGrpc.getFindAllMethod) == null) {
          ProductServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.bobelicious.EmptyRequest, com.bobelicious.ProductResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bobelicious.ProductResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.bobelicious.ProductRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findById(com.bobelicious.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.bobelicious.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.bobelicious.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bobelicious.ProductRequest,
                com.bobelicious.ProductResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bobelicious.FindByIdRequest,
                com.bobelicious.ProductResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bobelicious.DeleteRequest,
                com.bobelicious.ProductResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bobelicious.EmptyRequest,
                com.bobelicious.ProductResponseList>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.bobelicious.ProductRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(com.bobelicious.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.bobelicious.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.bobelicious.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bobelicious.ProductResponseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bobelicious.ProductResponse create(com.bobelicious.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bobelicious.ProductResponse findById(com.bobelicious.FindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bobelicious.ProductResponse delete(com.bobelicious.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bobelicious.ProductResponseList findAll(com.bobelicious.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bobelicious.ProductResponse> create(
        com.bobelicious.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bobelicious.ProductResponse> findById(
        com.bobelicious.FindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bobelicious.ProductResponse> delete(
        com.bobelicious.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bobelicious.ProductResponseList> findAll(
        com.bobelicious.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_FIND_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.bobelicious.ProductRequest) request,
              (io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.bobelicious.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.bobelicious.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.bobelicious.ProductResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.bobelicious.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.bobelicious.ProductResponseList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bobelicious.ProductServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
