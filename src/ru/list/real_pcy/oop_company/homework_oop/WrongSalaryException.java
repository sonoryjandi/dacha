package ru.list.real_pcy.oop_company.homework_oop;

public class WrongSalaryException extends Exception {
    public WrongSalaryException() {

    }

    public WrongSalaryException(String errorMessage) {
        super(errorMessage);
    }
}