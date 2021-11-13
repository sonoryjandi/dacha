package ru.list.real_pcy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать массив, который будет отображать количество корма для котов. То есть
 * если food[1] = 5, то у черного кота под номером 1 будет пять пакетиков еды.
 * Сама задача:
 * Создать функции, которые позволяют:
 * добавить или убавить еды у конкретного кота
 * добавить или убавить еды у всех котов сразу
 * добавить или убавить еды у четных или нечетных котов
 * Класс со статик массивом
 * + по аналогии с задачей "угадай число"
 * цикл ввод, пока пользователь не введет число 666
 * то есть как ввел 666, то выйти из программы
 * <p>
 * номер кота
 * сколько добавить
 * пример:
 * 2 и -3 - это типа отобрать у суки
 * в миске не может быть меньше 0 и больше 7 пакетиков корма
 * после ввода программа каждый раз выводит у кого сколько корма и меню
 */

public class CatFeeder {
    static String[] catsName = new String[]{"Некко", "Отто Фриш", "Эдвард Теллер",
            "Ричард Фейнман", "Роберт Оппенгеймер", "Энрико Ферми", "Лапусик"};
    static int[] catsFeeders = new int[7];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        do {
            System.out.println("Что будем делать?" +
                    "\n 1 - Накормим одного кота;" +
                    "\n 2 - Накормим всех котов;" +
                    "\n 3 - Накормим чётных котов;" +
                    "\n 4 - Накормим нечётных котов;" +
                    "\n 5 - Накормим всех полностью и сразу;" +
                    "\n 666 - Выйти");
            switch (scanner.next()) {
                case "1":
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    if (!scanner.hasNextInt()){
                        System.out.println("Вы ввели не число, попробуйте ещё раз!");
                        scanner.next();
                        break;
                    }
                    int foodCount = scanner.nextInt();
                    System.out.println("Какому коту?");
                    if (!scanner.hasNextInt()){
                        System.out.println("Вы ввели не число, попробуйте ещё раз!");
                        scanner.next();
                        break;
                    }
                    int catNumber = scanner.nextInt();
                    feedOneCat(foodCount, catNumber);
                    printAllCatsFood();
                    break;

                case "2":
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedAllCats(scanner.nextInt());
                    printAllCatsFood();
                    break;
                case "3":
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedOddAndNonOddCats(scanner.nextInt(), true);
                    printAllCatsFood();
                    break;
                case "4":
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedOddAndNonOddCats(scanner.nextInt(), false);
                    printAllCatsFood();
                    break;
                case "5":
                    feedAllCatsCompletely();
                    printAllCatsFood();
                    break;
                default:
                    System.out.println("Неверный набор!");
                    break;
                case "666":
                    System.out.println("Пока!");
                    return;
            }
        } while (true);
    }

    // Action
    private static void feedAllCatsCompletely() {
        Arrays.fill(catsFeeders, 7);
        System.out.println("Все котики сыты:)");
    }

    private static void feedOddAndNonOddCats(int foodCount, boolean isEven) {
        int seed = isEven ? 1 : 0;
        for (int i = seed; i < catsFeeders.length; i += 2) {
            feedOneCat(foodCount, i);
        }
    }

    private static void feedAllCats(int foodCount) {
        for (int i = 0; i < catsFeeders.length; i++) {
            feedOneCat(foodCount, i);
        }
    }

    private static void feedOneCat(int foodCount, int catNumber) {
        int sum = catsFeeders[catNumber] + foodCount;
        if (sum > 7) {
            System.out.println("У " + catsName[catNumber] + " и так полная миска. Не удалось покормить " + catsName[catNumber]);
            return;
        }
        if (sum < 0) {
            System.out.println("Это жестоко:( Вы отнимите у " + catsName[catNumber] + " всю еду. Мы не позволим!");
            return;
        }
        catsFeeders[catNumber] = sum;
    }

    private static void printAllCatsFood() {
        System.out.println();
        for (int i = 0; i < catsFeeders.length; i++) {
            System.out.println("У кота " + catsName[i] + " в миске " + catsFeeders[i] + " еды.");
        }
        System.out.println();
    }
}