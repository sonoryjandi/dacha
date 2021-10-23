package ru.list.real_pcy.exceptions;

public class NumberIsTooLongException extends Exception {
    public NumberIsTooLongException(){

    }

    public NumberIsTooLongException(String errorMessage){
        super(errorMessage);
    }
}