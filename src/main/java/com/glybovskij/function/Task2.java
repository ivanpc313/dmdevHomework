package com.glybovskij.function;

/**
 * Задание 2
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation(char +, -, *, /, %)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = +
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {

    public static void main(String[] args) {
        double operand1 = 15.3;
        double operand2 = 4.5;
        char operation = '/';

        double result = doesCalculation(operand1, operand2, operation);
        System.out.println(result);
    }

    public static double doesCalculation(double operand1, double operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '/' -> operand1 / operand2;
            case '*' -> operand1 * operand2;
            case '%' -> operand1 % operand2;
            default -> throw new IllegalArgumentException("Unexpected value: " + operation);
        };
    }
}
