package ru.list.real_pcy.oop_company.homework_oop;

public class EmptySalaryException extends Exception {
    public EmptySalaryException() {

    }

    public EmptySalaryException(String errorMessage) {
        super(errorMessage);
    }
}