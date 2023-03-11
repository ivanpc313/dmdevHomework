package com.glybovskij.introductionInOOP;

public class Home {

    private int homeNumber;
    private Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public void print(int homeNumber, Floor[] floors) {
        System.out.println("Дом № " + homeNumber + "," + " количество этажей " + floors.length);
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
