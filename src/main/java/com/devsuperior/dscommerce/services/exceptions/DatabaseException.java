package com.devsuperior.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException { //quando algum recurso não for encontrado
                                                                  //RuntimeException não exige Try Catch
    public DatabaseException(String msg) {
        super(msg);
    }

}
