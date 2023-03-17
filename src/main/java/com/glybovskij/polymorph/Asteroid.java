package com.glybovskij.polymorph;

public class Asteroid extends SpaceObjects implements Officiality {
    String material;
    double volume;
    Radius radius;

    public Asteroid(double weight, String material, double volume, Radius radius) {
        super(weight);
        this.material = material;
        this.volume = volume;
        this.radius = radius;
    }

    public int appropriateNumber() {
        int number = 0;
        boolean official;
        official = isOfficial(radius, material);
        if (official) {
            number = (int) (Math.random() * 10000);
        } else {
            System.out.println("Астероид не является официальным и не подходит для присвоения номера");
        }
        return number;
    }

    @Override
    public double getDiameter() {
        return Math.cbrt((3 * volume) / (4 * 3.14));
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "material='" + material + '\'' +
                ", volume=" + volume +
                ", radius=" + radius +
                '}';
    }
}
