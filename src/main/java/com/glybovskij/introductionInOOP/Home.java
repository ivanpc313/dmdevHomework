package com.glybovskij.introductionInOOP;

public class Home {
    private int homeNumber;
    private Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Дом № " + homeNumber + "," + " количество этажей " + floors.length);
    }
}
