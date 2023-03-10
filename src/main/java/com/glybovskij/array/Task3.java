package com.glybovskij.array;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3 {

    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};

        int[][] ints = generateToTwoDimensionalArray(array);
        printResultArray(ints);
    }

    private static void printResultArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] generateToTwoDimensionalArray(int[] array) {
        int[][] resultArray = new int[3][];
        int[] positiveNumbers = new int[getPositiveNumbersSize(array)];
        int[] negativeNumbers = new int[getNegativeNumbersSize(array)];
        int[] zeroNumbers = new int[getZeroNumbersSize(array)];
        resultArray[0] = negativeNumbers;
        resultArray[1] = zeroNumbers;
        resultArray[2] = positiveNumbers;

        for (int i = 0, index1 = 0, index2 = 0, index3 = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumbers[index1] = array[i];
                index1++;
            } else if (array[i] < 0) {
                negativeNumbers[index2] = array[i];
                index2++;
            } else {
                zeroNumbers[index3] = array[i];
                index3++;
            }
        }
        return resultArray;
    }

    private static int getZeroNumbersSize(int[] array) {
        int size = 0;
        for (int j : array) {
            if (j == 0) {
                size++;
            }
        }
        return size;
    }

    private static int getNegativeNumbersSize(int[] array) {
        int size = 0;
        for (int j : array) {
            if (j < 0) {
                size++;
            }
        }
        return size;
    }

    private static int getPositiveNumbersSize(int[] array) {
        int size = 0;
        for (int j : array) {
            if (j > 0) {
                size++;
            }
        }
        return size;
    }
}
