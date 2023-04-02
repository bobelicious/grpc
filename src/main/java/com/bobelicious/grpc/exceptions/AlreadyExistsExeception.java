package com.bobelicious.grpc.exceptions;

import io.grpc.Status;

public class AlreadyExistsExeception  extends BaseBusinessException{

    private static final String ERROR_MESSAGE = "Produto %s já cadastrado no sistema.";
    private String name;

    public AlreadyExistsExeception(String name) {
        super(String.format(ERROR_MESSAGE, name));
        this.name = name;

    }

    @Override
    public Status getStatusCode() {
        return Status.ALREADY_EXISTS;
    }

    @Override
    public String getErrorMessage() {
        return String.format(ERROR_MESSAGE, this.name);
    }
    
}
