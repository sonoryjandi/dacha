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
//        usersPassword();
        //LOGIN
        String userInput = login();
        try {
            String usersLogin = usersInput(userInput);
            System.out.println(usersLogin);
        } catch (DoesNotContainsLatinException е) {
            System.out.println("Ваш логин должен содержать только символы латинского алфавита");
        } catch (TooLongException e) {
            System.out.println("Ваш логин слишком длинный");
        } catch (Exception e) {
            System.out.println("Вы получили следующую ошибку: " + e.toString());
        } finally {
            System.out.println("Всем спасибо, все свободны");
        }

        //PASSWORD
//        try {
//            String usersPassword = usersInput(userInput);
//            System.out.println(usersPassword);
//        } catch (TooLongException e) {
//            System.out.println("Ваш пароль слишком длинный");
//        } catch (DoesNotContainsLatinException е) {
//            System.out.println("Ваш пароль не содержит символов латинского алфавита");
//        } catch (Exception e) {
//            System.out.println("Вы получили следующую ошибку: " + e.toString());
//        } finally {
//            System.out.println("Всем спасибо, все свободны");
//        }
    }

    private static String login() {
        System.out.println("Введите логин");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
//    private static String loginCheck(){
//        String userInput = login();
//        try {
//            String usersLogin = usersInput(userInput);
//            System.out.println(usersLogin);
//        } catch (TooLongException e) {
//            System.out.println("Ваш логин слишком длинный");
//        } catch (DoesNotContainsLatinException е) {
//            System.out.println("Ваш логин должен содержать только символы латинского алфавита");
//        } catch (Exception e) {
//            System.out.println("Вы получили следующую ошибку: " + e.toString());
//        } finally {
//            System.out.println("Всем спасибо, все свободны");
//        }
//        return userInput;
//    }

//    private static String usersPassword() {
//        System.out.println("Введите пароль");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }

    private static String usersInput(String login) throws TooLongException, DoesNotContainsLatinException {
        if (!login.matches("[a-zA-Z]+\\.?")) {
            throw new DoesNotContainsLatinException("There is wrong symbols is the input");
        }

        if (login.length() > 20)
            throw new TooLongException("There is wrong symbols is the input");
        return login;
    }
}