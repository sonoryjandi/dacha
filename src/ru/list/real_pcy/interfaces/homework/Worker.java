package ru.list.real_pcy.interfaces.homework;

public interface Worker {

    /**
     * Метод устанавливает имя компании.
     * @param name
     */
    void setCompanyName(String name);

    /**
     * Метод возвращает имя работника.
     * @return
     */
    String getName();

    /**
     * Метод устанавливает зарплату.
     * @param salary
     */
    void setSalary(double salary);

    /**
     * Метод печатает дефолтное приветствие.
     */
    default void printHello() {
        System.out.println("Hello! I'm WORKER. My name is " + this.getName());
    }
}
