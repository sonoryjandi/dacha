package ru.list.real_pcy.oop_company.homework_oop;

public class SalaryValidateException extends Exception {
    public SalaryValidateException() {

    }

    public SalaryValidateException(String errorMessage) {
        super(errorMessage);
    }
}