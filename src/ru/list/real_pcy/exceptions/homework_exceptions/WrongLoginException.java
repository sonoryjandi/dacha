package ru.list.real_pcy.exceptions.homework_exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {

    }

    public WrongLoginException(String errorMessage) {
        super(errorMessage);
    }
}