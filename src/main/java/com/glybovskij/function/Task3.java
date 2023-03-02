package com.glybovskij.function;

//Задание 3
//
//Даны два прямоугольных треугольника.
//Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
//Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
//
//Для этого понадобится написать 2 функции.
//Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
//Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
//Учитывать, что площадь может быть вещественным числом.
public class Task3 {

    public static void main(String[] args) {

        double a1 = 0;
        double b1 = 10;

        double a2 = 6;
        double b2 = 10;

        double square1 = square(a1, b1);
        double square2 = square(a2, b2);

        areaComparison(square1, square2);

    }

    public static double square(double o1, double o2) {
        double result = 0;
        if (o1 > 0 && o2 > 0) {
            result = 0.5 * (o1 * o2);
        } else {
            System.out.println("Введено отрицательное либо нулевое значение");
        }
        return result;
    }

    private static void areaComparison(double square1, double square2) {
        if (square1 == 0 || square2 == 0) {
            System.out.println("Неверные данные");
        } else if (square1 > square2) {
            System.out.printf("Площадь первого треугольника %f больше второго %f", square1, square2);
        } else if (square1 < square2) {
            System.out.printf("Площадь первого треугольника %f меньше второго %f", square1, square2);
        } else if (square1 == square2) {
            System.out.printf("Площади двух треугольников %f и %f равны", square1, square2);
        }

    }

}
