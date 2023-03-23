package com.glybovskij.collection1.task2;

import java.util.ArrayList;
import java.util.List;

import static com.glybovskij.collection1.task2.ChatHelper.convertToListPerson;
import static com.glybovskij.collection1.task2.ChatHelper.getAverageAge;

/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * <p>
 * Задача:
 * <p>
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * <p>
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class ChatExample {

    public static void main(String[] args) {
        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person(1, "Ivan", 19));
        personList1.add(new Person(2, "Petr", 32));
        personList1.add(new Person(3, "Alex", 14));
        personList1.add(new Person(4, "Timofei", 44));
        personList1.add(new Person(5, "Sergei", 64));

        List<Person> personList2 = new ArrayList<>();
        personList2.add(new Person(6, "Nikita", 16));
        personList2.add(new Person(7, "Alla", 25));
        personList2.add(new Person(8, "Svetlana", 27));
        personList2.add(new Person(9, "Julia", 13));
        personList2.add(new Person(10, "Darina", 20));
        personList2.add(new Person(11, "Fedor", 19));

        List<Person> personList3 = new ArrayList<>();
        personList3.add(new Person(12, "Diana", 35));
        personList3.add(new Person(13, "Darina", 10));
        personList3.add(new Person(14, "Sergei", 26));
        personList3.add(new Person(15, "Pavel", 29));

        List<Person> personList4 = new ArrayList<>();
        personList4.add(new Person(16, "Maksim", 18));
        personList4.add(new Person(17, "Georgij", 29));
        personList4.add(new Person(18, "Alexandra", 32));
        personList4.add(new Person(19, "Olga", 33));
        personList4.add(new Person(20, "Artem", 8));
        personList4.add(new Person(21, "Pavel", 16));
        personList4.add(new Person(22, "Ruslan", 20));

        List<Person> personList5 = new ArrayList<>();
        personList5.add(new Person(23, "Igor", 27));
        personList5.add(new Person(24, "Tatiana", 15));
        personList5.add(new Person(25, "Natalia", 17));

        List<Person> personList6 = new ArrayList<>();
        personList6.add(new Person(26, "Artur", 35));
        personList6.add(new Person(20, "Artem", 8));
        personList6.add(new Person(13, "Darina", 10));
        personList6.add(new Person(22, "Ruslan", 20));

        List<Person> personList7 = new ArrayList<>();
        personList7.add(new Person(27, "Anton", 74));
        personList7.add(new Person(28, "Viktoria", 25));
        personList7.add(new Person(29, "Valerij", 17));
        personList7.add(new Person(30, "Anna", 37));
        personList7.add(new Person(8, "Svetlana", 27));
        personList7.add(new Person(24, "Tatiana", 15));

        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Nexta", personList1));
        chats.add(new Chat("Gomel news", personList2));
        chats.add(new Chat("Avtotune", personList3));
        chats.add(new Chat("Height school", personList4));
        chats.add(new Chat("Moto fest 2023", personList5));
        chats.add(new Chat("Malahov fans", personList6));
        chats.add(new Chat("IT people", personList7));

        List<Person> personList = convertToListPerson(chats);
        System.out.println(personList);
        double averageAge = getAverageAge(personList);
        System.out.println(averageAge);
    }
}
