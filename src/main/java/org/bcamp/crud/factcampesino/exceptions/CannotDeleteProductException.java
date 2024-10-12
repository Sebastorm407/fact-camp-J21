package org.bcamp.crud.factcampesino.exceptions;

public class CannotDeleteProductException extends RuntimeException{
    public CannotDeleteProductException(String message) {
        super(message);
    }
}
