package com.glybovskij.introductionInOOP;

public class Room {

    private boolean iSPassageRoom;

    public Room(boolean iSPassageRoom) {
        this.iSPassageRoom = iSPassageRoom;
    }

    public void print(boolean iSPassageRoom) {
        if (iSPassageRoom) {
            System.out.println("Проходная комната");
        } else {
            System.out.println("Не проходная комната");
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "iSPassageRoom=" + iSPassageRoom +
                '}';
    }
}
