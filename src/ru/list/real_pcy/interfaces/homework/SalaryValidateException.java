package ru.list.real_pcy.interfaces.homework;

public class SalaryValidateException extends Exception {
    public SalaryValidateException() {

    }

    public SalaryValidateException(String errorMessage) {
        super(errorMessage);
    }
}