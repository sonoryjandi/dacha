package ru.list.real_pcy.oop_company.homework_oop;

/**
 * 1. Создать 1 статичное поле любого типа String попробовать поменять
 * его у Боба и у Алекса; String companyName. Должен быть статичный метод,
 * который работает с этим полем.
 * 2. Написать метод в этом классе, который проверяет, что зарплата не меньше,
 * чем возраст - этот метод должен возвращать boolean.
 * 3. Написать метод salaryValidate, который вызывает метод из пункта 2 и
 * выкидывает исключения, если проверка не проходит.
 * 4. Написать класс Company, который хранит массив person и
 * позволяет добавлять новых person.
 * (методы должны называться типа "принять на работу" и "уволить").
 * 5. Класс Company должен иметь метод, который напечатает всех работников.
 * У Company должен быть field name.
 */

public class Person {

    private String name;
    private int age;
    private double salary;
    private static String companyName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Т.к CompanyName - статичное поле, при изменении поля один раз происходит изменение имени на уровне всего класса
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    // endregion

    public boolean isSalaryGreaterThenAge() {
        return salary >= age;
    }

    public void salaryValidate() throws SalaryValidateException {
        if (!isSalaryGreaterThenAge()) {
            throw new SalaryValidateException("Возраст больше зарплаты!");
        }
    }

    public void emptySalary() throws EmptySalaryException {
        if (salary == 0) {
            throw new EmptySalaryException("Зарплата не объявлена");
        }
    }
}