package ru.list.real_pcy.abstract_class;

public class SalaryValidateException extends Exception {
    public SalaryValidateException() {

    }

    public SalaryValidateException(String errorMessage) {
        super(errorMessage);
    }
}