package com.glybovskij.function;

public class Task2 {


    public static void main(String[] args) {

        double operand1 = 15.3;
        double operand2 = 4.5;
        char operation = '/';

        double calculate = function(operand1, operand2, operation);
        System.out.println(calculate);
    }

    public static double function(double value1, double value2, char value3) {

        return switch (value3) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '/' -> value1 / value2;
            case '*' -> value1 * value2;
            case '%' -> value1 % value2;
            default -> throw new IllegalStateException("Unexpected value: " + value3);
        };

    }

}
