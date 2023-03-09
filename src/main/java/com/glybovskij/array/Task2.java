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
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+' };

        int[] generatedArray = generateToNumbers(array);
        printResult(generatedArray);
    }

    private static void printResult(int[] array) {
        int sum = 0;
        double average;
        for (int j : array) {
            sum += j;
        }
        average = sum / (double) array.length;
        for (int j : array) {
            if (j > average) {
                System.out.print(j + " ");
            }
        }
    }

    private static int[] generateToNumbers(char[] array) {
        int[] generatedArray = new int[array.length];
        for (int i = 0, index1 = 0; i < array.length; i++) {
            generatedArray[index1] = array[i];
            index1++;
        }
        return generatedArray;
    }
}
