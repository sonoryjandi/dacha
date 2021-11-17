package ru.list.real_pcy.interfaces.homework;

public class WrongSalaryException extends Exception {
    public WrongSalaryException() {

    }

    public WrongSalaryException(String errorMessage) {
        super(errorMessage);
    }
}