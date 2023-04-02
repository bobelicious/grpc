package com.bobelicious.grpc.exceptions;

import io.grpc.Status;

public class NotFoundException  extends BaseBusinessException{

    private static final String ERROR_MESSAGE = "Produto com ID %s nao encontrado no sistema.";
    private Long id;

    public NotFoundException(Long id) {
        super(String.format(ERROR_MESSAGE, id));
        this.id = id;
    }

    @Override
    public Status getStatusCode() {
        return Status.NOT_FOUND;
    }

    @Override
    public String getErrorMessage() {
        return String.format(ERROR_MESSAGE, this.id);
    }
}
