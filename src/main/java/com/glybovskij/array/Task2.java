package com.glybovskij.array;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: ['a', '6', 'y', 'P', 'T', 'q', '9', '+'] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {

    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

        int[] generatedArray = generateToNumbers(array);
        printMoreOfAverageResult(generatedArray);
    }

    private static void printMoreOfAverageResult(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average;
        average = sum / (double) array.length;
        for (int value : array) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
    }

    private static int[] generateToNumbers(char[] array) {
        int[] generatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            generatedArray[i] = array[i];
        }
        return generatedArray;
    }
}
