package com.glybovskij.collection1.task1;

import com.glybovskij.collection1.task1.comparator.ChatNumberOfUsersComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задание 1
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class SortExample {

    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Nexta",5412));
        chats.add(new Chat("Gomel news",1043));
        chats.add(new Chat("Avtotune",4321));
        chats.add(new Chat("Height school",576));
        chats.add(new Chat("Moto fest 2023",895));
        chats.add(new Chat("Malahov fans",243));
        chats.add(new Chat("IT people",5412));

        List<Chat> lessThan1000People = ChatHelper.getLessThan1000People(chats);
        Collections.sort(lessThan1000People);
        System.out.println(lessThan1000People);
        lessThan1000People.sort(new ChatNumberOfUsersComparator());
       // lessThan1000People.sort(Comparator.comparing(Chat::getNumberOfUsers));
        System.out.println(lessThan1000People);
    }
}
