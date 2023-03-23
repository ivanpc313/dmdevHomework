package com.glybovskij.collection1.task1.comparator;

import com.glybovskij.collection1.task1.Chat;

import java.util.Comparator;

public class ChatNumberOfUsersComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getNumberOfUsers() == o2.getNumberOfUsers()) {
            return o1.getChatName().compareTo(o2.getChatName());
        }
        return Integer.compare(o2.getNumberOfUsers(), o1.getNumberOfUsers());
    }
}
