package com.glybovskij.function;

public class Task1 {

    //Задание 1
    //
    //В переменной minutes лежит число от 0 до 59.
    //Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
    //в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
    //
    //Протестировать функцию в main.

    public static void main(String[] args) {

        int a = 0;
        int b = 59;

        int minutes = a + (int) (Math.random() * b);
        System.out.println("Число (от 0 до 59): " + minutes);

        quarter(minutes);

    }

    public static void quarter(int value) {

        if (value <= 15) {
            System.out.println(value + " -первая четверть часа");
        } else if (16 < value && value <= 30) {
            System.out.println(value + " -вторая четверть часа");
        } else if (31 < value && value <= 45) {
            System.out.println(value + " -третья четверть часа");
        } else if (46 < value && value <= 59) {
            System.out.println(value + " -четвертая четверть часа");
        }

    }

}
