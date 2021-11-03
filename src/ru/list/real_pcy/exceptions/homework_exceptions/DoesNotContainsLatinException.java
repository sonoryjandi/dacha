package ru.list.real_pcy.exceptions.homework_exceptions;

public class DoesNotContainsLatinException extends Exception {
    public DoesNotContainsLatinException() {

    }

    public DoesNotContainsLatinException(String errorMessage) {
        super(errorMessage);
    }
}