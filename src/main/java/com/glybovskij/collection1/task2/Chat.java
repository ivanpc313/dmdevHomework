package com.glybovskij.collection1.task2;

import java.util.List;

public class Chat implements Comparable<Chat> {

    private String chatName;
    private List<Person> list;

    public Chat(String chatName, List<Person> list) {
        this.chatName = chatName;
        this.list = list;
    }

    @Override
    public int compareTo(Chat o) {
        int i = chatName.compareTo(o.getChatName());
        return Integer.compare(i, 0);
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }
}
