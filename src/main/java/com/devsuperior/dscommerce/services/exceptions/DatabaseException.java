package com.devsuperior.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException { //quando algum recurso não for encontrado
                                                                  //RuntimeException não exige Try Catch
    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
