package ru.list.real_pcy.abstract_class;

public abstract class WorkerFields implements Worker {
    private String name;
    private double salary;
    private String companyName;

    // region getter/setter

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // endregion
}
