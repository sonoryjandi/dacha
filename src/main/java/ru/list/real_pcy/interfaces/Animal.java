package ru.list.real_pcy.interfaces;

public class Animal implements Info {
    public int id; //идентификатор животного

    public Animal(int id) { //через конструктор
        this.id = id;
    }

    public void sleep(){  //на объекте класса Animal мы можем вызвать метод sleep
        System.out.println("I'm sleeping");
    }

    @Override //аннотация, что метод переопределён, она обязывает метод быть таким же, что и в классе Info
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
