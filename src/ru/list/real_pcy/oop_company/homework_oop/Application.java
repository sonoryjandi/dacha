package ru.list.real_pcy.oop_company.homework_oop;

public class Application {

    public static void main(String[] args) throws WrongSalaryException {
        Person alex = new Person("Alex", 23);
        Person bob = new Person("Bob", 34);
        alex.setCompanyName("Google");
        bob.setCompanyName("Nivea");
        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());
        System.out.println(Person.getCompanyName());

        Company leon = new Company("Leon");
        leon.printAllWorkers();
        leon.addNewWorker(alex);
        leon.addNewWorker(bob);
        leon.printAllWorkers();
        leon.deleteWorker(bob);
        leon.printAllWorkers();

        alex.setSalary(12000);
        alex.salaryValidate();
        bob.salaryValidate();
    }
}