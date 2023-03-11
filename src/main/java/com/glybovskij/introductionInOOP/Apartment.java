package com.glybovskij.introductionInOOP;

import java.util.Arrays;

public class Apartment {
    private int apartmentNumber;
    private Room[] rooms;

    public Apartment(int apartmentNumber, Room[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public void print(int apartmentNumber, Room[] rooms) {
        System.out.println("Квартира № " + apartmentNumber + "," + "количество комнат " + rooms.length);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentNumber=" + apartmentNumber +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
