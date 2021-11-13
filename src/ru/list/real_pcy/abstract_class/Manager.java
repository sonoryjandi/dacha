package ru.list.real_pcy.abstract_class;

public class Manager extends WorkerFields {

    private String companyName;
    private String name;
    private double salary;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
