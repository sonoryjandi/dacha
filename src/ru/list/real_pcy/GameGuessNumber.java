package ru.list.real_pcy;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание: написать программу, которая загадывает число от 0 до 100. Программа заправшивает у пользователя
 * число, которое он должен угадать. У пользователя 10 попыток. Как только игра заканчивается, ввыводится
 * загаданное число.
 * При каждой неверной попытке программа сообщает, загаданное число было больше или меньше, чем введённое.
 */

public class GameGuessNumber {
    public static void main(String[] args) {
        gameGuessNumber();
    }

    private static void gameGuessNumber() {
        System.out.println("Введите число от 1 до 100");
        int result = getRandomNumber();
        Scanner scan = new Scanner(System.in);
        String inputNumber;

        for (int counter = 0; counter < 10; counter++) {
            inputNumber = scan.next();
            if (!validation(inputNumber)){
                System.out.println("Вы потратили попытку, так как ввели не число:)");
                continue;
            }
            if (Integer.parseInt(inputNumber) > result) {
                System.out.println("Загаданное число меньше");
                continue;
            }
            if (Integer.parseInt(inputNumber) < result) {
                System.out.println("Загаданное число больше");
                continue;
            }
            System.out.println("Верно!");
            break;
        }
        System.out.println("Загаданное число - " + result);
    }

    private static int getRandomNumber() {
        Random r = new Random();
        int highPoint = 100;
        int rangeCorrection = 1;
        return r.nextInt(highPoint + rangeCorrection);
    }

    private static boolean validation (String inputNumber) {
     return inputNumber.matches("[0-9]+");
    }
}
