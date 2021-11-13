package ru.list.real_pcy.abstract_class;

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

public class Person extends WorkerFields {

    private int age;

    public Person(String name, int age) {
        setName(name);
        this.age = age;
    }

    //2. Написать метод в этом классе, который проверяет, что зарплата не меньше, чем возраст - этот метод должен возвращать boolean.

    public boolean isSalaryGreaterThenAge() {
        return getSalary() >= age;
    }
    //3. Написать метод salaryValidate, который вызывает метод из пункта 2 и выкидывает исключения, если проверка не проходит.

    public void salaryValidate() throws SalaryValidateException {
        if (!isSalaryGreaterThenAge()) {
            throw new SalaryValidateException("Возраст больше зарплаты!");
        }
    }
    public void emptySalary() throws EmptySalaryException {
        if (0 == getSalary()) {
                throw new EmptySalaryException("Зарплата не объявлена");
        }
    }

    @Override
    public void printHello() {
        System.out.println("Hello, I'm PERSON");
    }

    // region getter/setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // endregion
}