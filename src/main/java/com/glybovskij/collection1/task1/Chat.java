package com.glybovskij.collection1.task1;

public class Chat implements Comparable<Chat> {

    private String chatName;
    private int numberOfUsers;

    public Chat(String chatName, int numberOfUsers) {
        this.chatName = chatName;
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public int compareTo(Chat o) {
        int i = chatName.compareTo(o.getChatName());
        return Integer.compare(i, 0);
    }

    @Override
    public String toString() {
        return "{" +
                "chatName='" + chatName + '\'' +
                " numberOfUsers=" + numberOfUsers +
                '}' + '\n';
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }
}
