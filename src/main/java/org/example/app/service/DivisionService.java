package org.example.app.service;

public class DivisionService {
    public static double divide (int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) num1 / num2;
    }

}
