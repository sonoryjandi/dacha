package ru.list.real_pcy.exceptions;

public class DoesNotContainsNumberException extends RuntimeException {
    public DoesNotContainsNumberException(){

    }

    public DoesNotContainsNumberException(String errorMessage){
        super(errorMessage);
    }
}