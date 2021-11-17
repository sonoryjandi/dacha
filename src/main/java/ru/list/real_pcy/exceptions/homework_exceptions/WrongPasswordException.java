package ru.list.real_pcy.exceptions.homework_exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String errorMessage) {
        super(errorMessage);
    }
}