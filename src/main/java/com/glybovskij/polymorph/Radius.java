package com.glybovskij.polymorph;

public class Radius {

    private final double radius;

    public Radius(int radius) {
        this.radius = radius;
    }

    public double diameter(Radius radius) {
        return this.radius * 2;
    }

    @Override
    public String toString() {
        return "Radius{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }
}
