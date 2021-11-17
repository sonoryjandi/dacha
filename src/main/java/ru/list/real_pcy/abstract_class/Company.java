package ru.list.real_pcy.abstract_class;

import java.util.Arrays;

public class Company implements IdealCompany {

    private Worker[] arrayWorkers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.arrayWorkers = new Worker[0];
    }

    @Override
    public void addNewWorker(Worker newWorker, double salary) {
        arrayWorkers = Arrays.copyOf(arrayWorkers, arrayWorkers.length + 1);
        arrayWorkers[arrayWorkers.length - 1] = newWorker;
        newWorker.setCompanyName(this.name);
        newWorker.setSalary(salary);
    }

    @Override
    public void deleteWorker(Worker firedWorker) {
        Worker[] newArrayWorkers = new Worker[arrayWorkers.length - 1];
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
    @Override
    public void printAllWorkers() {
        for (int i = 0; i < arrayWorkers.length; i++) {
            System.out.println(arrayWorkers[i].getName());
        }
    }

    //region getter-setter
    public Worker[] getArrayWorkers() {
        return arrayWorkers;
    }

    public void setArrayWorkers(Worker[] arrayWorkers) {
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