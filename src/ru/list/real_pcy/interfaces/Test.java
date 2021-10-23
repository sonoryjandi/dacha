package ru.list.real_pcy.interfaces;

public class Test {
    public static void main(String[] args) {
        //1
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Bob");

//        animal1.sleep();
//        person1.sayHello();

//        animal1.showInfo();
//        person1.showInfo();

        //Суть: если класс реализует какой-то интерфейс (а их может быть сколько угодно, перечисляются через запятую),
        // он обязан исполнить методы, которые в этом интерфейсе указаны.

        //2
        Info info1 = new Animal(1); //переменная info1 типа info ссылается на объект класса Animal
        Info info2 = new Person("Bob");
        //мы можем так делать, потому что классы Animal и Person реализуют интерфейс Info
        //в каждом классе Animal или Person существуют методы из интерфейса Info, потому что эти классы реализуют этот интерфейс
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}

// если у нас есть интерфейс runnable (способный бежать), мы понимаем, что в каждом таком классе у нас есть метод run