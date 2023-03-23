package com.glybovskij.collection1.task1;

import java.util.ArrayList;
import java.util.List;

public final class ChatHelper {
    private ChatHelper() {
    }

    public static List<Chat> getLessThan1000People(List<Chat> chats) {
        List<Chat> chat = new ArrayList<>();
        if (chats.isEmpty()) {
            System.out.println("Список чатов пуст");
        } else {
            for (Chat value : chats) {
                if (value.getNumberOfUsers() > 1000) {
                    chat.add(value);
                }
            }
        }
        return chat;
    }
}
