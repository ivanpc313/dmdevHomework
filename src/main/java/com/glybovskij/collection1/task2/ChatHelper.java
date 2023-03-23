package com.glybovskij.collection1.task2;

import java.util.ArrayList;
import java.util.List;

public final class ChatHelper {
    private ChatHelper() {
    }

    public static double getAverageAge(List<Person> list) {
        int sum = 0;

        for (Person person : list) {
            sum += person.getAge();
        }
        return (double) sum / list.size();
    }

    public static List<Person> convertToListPerson(List<Chat> chats) {
        List<Person> personList = new ArrayList<>();
        for (Chat chat : chats) {
            List<Person> list = chat.getList();
            for (Person person : list) {
                if (person.getAge() > 18) {
                    personList.add(person);
                }
            }
        }
        return personList;
    }
}
