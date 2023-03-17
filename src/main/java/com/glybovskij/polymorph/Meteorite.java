package com.glybovskij.polymorph;

public class Meteorite extends SpaceObjects implements Dangerous {
    double square;
    boolean closeness;
    Radius radius;

    public Meteorite(double weight, double square, boolean closeness, Radius radius) {
        super(weight);
        this.square = square;
        this.closeness = closeness;
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return Math.sqrt(square / 4 * 3.14);
    }

    @Override
    public void isDangerous() {
        if (radius.getRadius() > 30 && closeness) {
            System.out.println("Метеорит опасен для Земли");
        } else {
            System.out.println("Метеорит не опасен для Земли");
        }
    }

    @Override
    public String toString() {
        return "Meteorite{" +
                "square=" + square +
                ", closeness=" + closeness +
                ", radius=" + radius +
                '}';
    }
}
