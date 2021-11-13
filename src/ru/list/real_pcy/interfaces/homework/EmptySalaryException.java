package ru.list.real_pcy.interfaces.homework;

public class EmptySalaryException extends Exception {
    public EmptySalaryException() {

    }

    public EmptySalaryException(String errorMessage) {
        super(errorMessage);
    }
}