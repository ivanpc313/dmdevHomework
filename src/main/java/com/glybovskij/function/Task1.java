package com.glybovskij.function;

/**
 * Задание 1
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Task1 {

    public static void main(String[] args) {
        printQuarter(randomMinutes(0, 59));
    }

    public static void printQuarter(int minutes) {
        if (minutes <= 15) {
            System.out.println(minutes + " -первая четверть часа");
        } else if (minutes <= 30) {
            System.out.println(minutes + " -вторая четверть часа");
        } else if (minutes <= 45) {
            System.out.println(minutes + " -третья четверть часа");
        } else if (minutes <= 59) {
            System.out.println(minutes + " -четвертая четверть часа");
        }
    }

    public static int randomMinutes(int initialValue, int finalValue) {
        return initialValue + (int) (Math.random() * finalValue);
    }
}
