package ru.list.real_pcy.oop_company.homework_oop;

import java.util.Arrays;

public class Company {

    //Массивы
    private Person[] arrayWorkers;
    private String name;

//    public void hirePerson(Person newWorker) {
//        for (int i = 0; i < arrayWorkers.length; i++) {
//            if (arrayWorkers[1] != null) {
//                continue;
//            } else {
//                arrayWorkers[i] = newWorker;
//                return;
//            }
//        }
//        System.out.println("Работников слишком много");
//    }

    public void addNewWorker(Person newWorker) {
//        int currentLength = arrayWorkers.length;
//        Person[] newArrayWorkers = new Person[currentLength+1];
//        for (int i = 0; i < currentLength; i++){
//            newArrayWorkers[i] = arrayWorkers[i];
//        }
//        newArrayWorkers[newArrayWorkers.length - 1] = newWorker;
//        arrayWorkers = newArrayWorkers;

        arrayWorkers = Arrays.copyOf(arrayWorkers, arrayWorkers.length + 1);
        arrayWorkers[arrayWorkers.length - 1] = newWorker;
        newWorker.setCompanyName(this.name);
    }
//TODO при увольнении у сотрудника менять companyName

    public void deleteWorker(Person firedWorker) {
        Person[] newArrayWorkers = new Person[arrayWorkers.length - 1];
        int counter = 0;
        for (int i = 0; i < arrayWorkers.length - 1; i++) {
            if (arrayWorkers[i] != firedWorker) {
                newArrayWorkers[counter] = arrayWorkers[i];
                counter++;
            }
        }
        arrayWorkers = newArrayWorkers;
    }

        public int getLength () {
        return arrayWorkers.length;
        }

        public void printAllWorkers () {
            for (int i = 0; i < arrayWorkers.length; i++) {
                Person s = arrayWorkers[i];
                System.out.println(s.getName());
            }
        }


        //region getter-setter
        public Person[] getArrayWorkers () {
            return arrayWorkers;
        }

        public void setArrayWorkers (Person[]arrayWorkers){
            this.arrayWorkers = arrayWorkers;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        // endregion
        // region collection
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        public void addPersonToWork (String name){
//            arrayList.add(name);
//        }
//
//        public void print () {
//            //iter
//            for (String s : arrayList) {
//                System.out.println(s);
////        System.out.println(arrayList);
//            }
//        }
        // endregion
    }