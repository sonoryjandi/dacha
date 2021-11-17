package ru.list.real_pcy.interfaces.homework;

import ru.list.real_pcy.oop_company.homework_oop.WrongSalaryException;

public class Application {

    public static void main(String[] args) throws WrongSalaryException {
        Worker ann = new Manager("Ann");
        Worker alex = new Person("Alex", 22);
        Person bob = new Person("Bob", 22);

        Company google = new Company("Google");
        google.addNewWorker(ann, 23000);
        google.addNewWorker(bob, 56000);
        google.addNewWorker(alex, 140000);
        google.printAllWorkers();
        bob.salaryValidate();


//        ann.printHello();
//        alex.printHello();
//        bob.printHello();

        google.deleteWorker(bob);

        google.printAllWorkers();
    }
}