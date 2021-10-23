package ru.list.real_pcy.exceptions.homework_exceptions;

public class DoesNotContainsLatinException extends RuntimeException {
    public DoesNotContainsLatinException() {

    }

    public DoesNotContainsLatinException(String errorMessage) {
        super(errorMessage);
    }
}