package com.glybovskij.introductionInOOP;

import java.util.Arrays;

public class Apartment {
    private int apartmentNumber;
    private Room[] rooms;

    public Apartment(int apartmentNumber, Room[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира № " + apartmentNumber + "," + "количество комнат " + rooms.length);
    }

}
