package org.example.app.utils;

import java.util.Scanner;

public class Validator {

    // Метод для валідації введення цілих чисел
    public static int validateIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println(Constants.THIS_IS_NOT_A_NUMBER); // Виводимо повідомлення, якщо введено не число
            scanner.next(); // Очистити некоректний ввід
        }
        return scanner.nextInt(); // Повертаємо коректне ціле число
    }

    // Метод для валідації ділення на 0
    public static boolean validateDivision(int divisor) {
        if (divisor == 0) {
            System.out.println(Constants.NO_DIV_BY_ZERO); // Виводимо повідомлення, якщо ділення на нуль
            return false; // Повертаємо false, якщо ділення неможливе
        }
        return true; // Повертаємо true, якщо ділення можливе
    }
}
