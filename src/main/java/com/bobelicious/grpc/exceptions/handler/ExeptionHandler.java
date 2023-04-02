package com.bobelicious.grpc.exceptions.handler;

import com.bobelicious.grpc.exceptions.BaseBusinessException;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class ExeptionHandler {

    @GrpcExceptionHandler(BaseBusinessException.class)
    public StatusRuntimeException handleBusinessException(BaseBusinessException e) {
        return e.getStatusCode().withCause(e.getCause()).withDescription(e.getErrorMessage()).asRuntimeException();
    }
}
