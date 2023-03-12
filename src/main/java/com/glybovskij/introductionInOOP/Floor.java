package com.glybovskij.introductionInOOP;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Apartment[] apartment;

    public Floor(int floorNumber, Apartment[] apartment) {
        this.floorNumber = floorNumber;
        this.apartment = apartment;
    }

    public Apartment[] getApartment() {
        return apartment;
    }
    public void print() {
        System.out.println("Этаж " + floorNumber + "," + "количество квартир " + apartment.length);
    }
}
