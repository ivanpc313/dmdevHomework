package com.glybovskij.array;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};

        int[] positiveArray = getPositiveArray(array);
        printMultipliedArray(positiveArray);
    }

    private static void printMultipliedArray(int[] positiveArray) {
        for (int i = 0; i < positiveArray.length; i++) {
            positiveArray[i] = positiveArray[i] * positiveArray.length;
            System.out.print(positiveArray[i] + " ");
        }
    }

    private static int[] getPositiveArray(int[] array) {
        int[] positiveArray = new int[positiveSize(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArray[j] = array[i];
                j++;
            }
        }
        return positiveArray;
    }

    private static int positiveSize(int[] array) {
        int size = 0;
        for (int value : array) {
            if (value >= 0) {
                size++;
            }
        }
        return size;
    }
}
