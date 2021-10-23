package ru.list.real_pcy.exceptions.homework_exceptions;

public class TooLongException extends Exception {
    public TooLongException() {

    }

    public TooLongException(String errorMessage) {
        super(errorMessage);
    }
}
