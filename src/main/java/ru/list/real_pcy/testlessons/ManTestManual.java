package ru.list.real_pcy.testlessons;

public class ManTestManual {
    public static void main(String[] args) {
        testGetNameManual();
        testGetAgeManual();
    }

    public static void testGetNameManual() {
        Man man = new Man("Max", 22);
//        man.setName("Rex");
        if (!"Max".equals(man.getName())) {
            throw new AssertionError("Метод работает неверно!");
        }
    }

    public static void testGetAgeManual(){
        Man man = new Man("Max", 22);
        man.setAge(78);
        int mansAge = 22;
        if (!(mansAge == man.getAge())) {
            throw new AssertionError("Метод работает неверно!");
        }
    }


}
