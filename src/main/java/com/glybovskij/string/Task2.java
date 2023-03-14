package com.glybovskij.string;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        int result = sumNumbersOfArray(extractDigitsFromString(value));
        System.out.println(result);
    }

    private static int[] extractDigitsFromString(String value) {
        String stringWithoutSpace = value.replace(" ", "");
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < stringWithoutSpace.length(); i++) {
            char charAt = stringWithoutSpace.charAt(i);
            if (Character.isDigit(charAt)) {
                digits.append(charAt);
            }
        }
        int[] digitsArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitsArray[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        return digitsArray;
    }

    private static int sumNumbersOfArray(int[] array) {
        int sumAllNumbers = 0;
        for (int value : array) {
            sumAllNumbers += value;
        }
        return sumAllNumbers;
    }
}
