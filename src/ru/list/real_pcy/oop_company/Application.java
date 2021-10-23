package ru.list.real_pcy.oop_company;

public class Application {

    public static void main(String[] args) {
        ru.list.real_pcy.oop.Person alex = new ru.list.real_pcy.oop.Person();
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

        ru.list.real_pcy.oop.Person bob = new ru.list.real_pcy.oop.Person();
        bob.setName("Bob");
        bob.setAge(13);
    }
}