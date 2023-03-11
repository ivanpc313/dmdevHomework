package com.glybovskij.introductionInOOP;

import java.util.Arrays;

public class Floor {

    private int floorNumber;
    private Apartment[] apartment;

    public Floor(int floorNumber, Apartment[] apartment) {
        this.floorNumber = floorNumber;
        this.apartment = apartment;
    }

    public void print(int floorNumber, Apartment[] apartment) {
        System.out.println("Этаж " + floorNumber + "," + "количество квартир " + apartment.length);
    }

    public Apartment[] getApartment() {
        return apartment;
    }

    public void setApartment(Apartment[] apartment) {
        this.apartment = apartment;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", apartment=" + Arrays.toString(apartment) +
                '}';
    }
}
