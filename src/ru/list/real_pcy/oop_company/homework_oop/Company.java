package ru.list.real_pcy.oop_company.homework_oop;

import java.util.Arrays;

public class Company {

    private Person[] arrayWorkers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.arrayWorkers = new Person[0];
    }

    public void addNewWorker(Person newWorker) {
        arrayWorkers = Arrays.copyOf(arrayWorkers, arrayWorkers.length + 1);
        arrayWorkers[arrayWorkers.length - 1] = newWorker;
        newWorker.setCompanyName(this.name);
    }

    public void deleteWorker(Person firedWorker) {
        Person[] newArrayWorkers = new Person[arrayWorkers.length - 1];
        int counter = 0;
        for (int i = 0; i < arrayWorkers.length; i++) {
            if (arrayWorkers[i] == firedWorker) {
                continue;
            }
            newArrayWorkers[counter] = arrayWorkers[i];
            counter++;
        }
        firedWorker.setCompanyName(null);
        arrayWorkers = newArrayWorkers;
    }

    //        5. Класс Company должен иметь метод, который напечатает всех работников.
    public void printAllWorkers() {
        for (int i = 0; i < arrayWorkers.length; i++) {
            Person s = arrayWorkers[i];
            System.out.println(s.getName());
        }
    }

    //region getter-setter
    public Person[] getArrayWorkers() {
        return arrayWorkers;
    }

    public void setArrayWorkers(Person[] arrayWorkers) {
        this.arrayWorkers = arrayWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // endregion
}