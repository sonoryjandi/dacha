package ru.list.real_pcy.exceptions.homework_exceptions;

import java.util.Scanner;

/**
 * Создать статический метод который принимает на вход три параметра:
 * login, password и confirmPassword. Login должен содержать только латинские буквы.
 * Длина login должна быть меньше 20 символов.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать только латинские буквы.
 * Длина password должна быть меньше 20 символов.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
 * – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода. Используем multi-catch block. Метод возвращает true,
 * если значения верны или false в другом случае
 * <p>
 * Для проверки латинских букв - input.matches ("[a-zA-Z]+\\.?");
 */
public class LoginPasswordHomework {

    public static void main(String[] args) {
        do {
            System.out.println("Пройдите авторизацию. Введите логин, пароль и подтвердите пароль");
        } while (!isValuesCorrect());
    }

    public static boolean isValuesCorrect() {
        Scanner scanner = new Scanner(System.in);
        try {
            validationCheck(scanner.next(), scanner.next(), scanner.next());
            return true;
        } catch (DoesNotContainsLatinException | TooLongException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void validationCheck (String login, String password, String checkPassword) throws DoesNotContainsLatinException, TooLongException, WrongPasswordException{
        if (!login.matches("[a-zA-Z]+\\.?")) {
            throw new DoesNotContainsLatinException("Логин должен содержать только символы латинского алфавита!");
        }
        if (!password.matches("[a-zA-Z]+\\.?")) {
            throw new DoesNotContainsLatinException("Пароль должен содержать только символы латинского алфавита!");
        }
        if (login.length() > 19) {
            throw new TooLongException("Логин слишком длинный!");
        }
        if (password.length() > 19) {
            throw new TooLongException("Пароль слишком длинный!");
        }
        if (!password.equals(checkPassword)) {
            throw new WrongPasswordException("Вы ввели неверный пароль!");
        }
        System.out.println("Вы успешно авторизированы!");
    }
}