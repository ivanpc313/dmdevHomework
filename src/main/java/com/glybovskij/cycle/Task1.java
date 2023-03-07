package com.glybovskij.cycle;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {

    public static void main(String[] args) {
        int number = 228912;

        printEvenNumbers(number);
        printOddNumbers(number);
    }

    private static void printOddNumbers(int number) {
        System.out.print("Нечетные числа: ");
        int counter = 0;
        while (number > 0) {
            int oddNumb;
            oddNumb = number % 10;
            if (oddNumb % 2 != 0) {
                counter++;
            }
            number = number / 10;
        }
        System.out.println(counter);
    }

    private static void printEvenNumbers(int number) {
        System.out.print("Четные числа: ");
        int counter = 0;
        while (number > 0) {
            int evenNumb;
            evenNumb = number % 10;
            if (evenNumb % 2 == 0) {
                counter++;
            }
            number = number / 10;
        }
        System.out.println(counter);
    }
}
