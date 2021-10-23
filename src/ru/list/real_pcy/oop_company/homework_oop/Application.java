package ru.list.real_pcy.oop_company.homework_oop;

public class Application {

    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("Dan");
        System.out.println(alex.getName());
        alex.setName("Finn");
        System.out.println(alex.getName());
//        System.out.println(person.name);
//        person.getName();
//        String name = person.getName();
//        System.out.println(name);

        alex.setAge(78);
        System.out.println(alex.getAge());

        alex.setAge(34);
        System.out.println(alex.getAge());

        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(13);
    }
}