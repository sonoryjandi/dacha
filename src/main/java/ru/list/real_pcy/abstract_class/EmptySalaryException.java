package ru.list.real_pcy.abstract_class;

public class EmptySalaryException extends Exception {
    public EmptySalaryException() {

    }

    public EmptySalaryException(String errorMessage) {
        super(errorMessage);
    }
}