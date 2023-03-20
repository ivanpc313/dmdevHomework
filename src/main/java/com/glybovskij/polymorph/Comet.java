package com.glybovskij.polymorph;

public class Comet extends SpaceObject {
    private Radius radius;
    private boolean seenFromEarth;

    public Comet(double weight, Radius radius, boolean seenFromEarth) {
        super(weight);
        this.radius = radius;
        this.seenFromEarth = seenFromEarth;
    }

    public void isGreatComet() {
        if (seenFromEarth && radius.getRadius() > 10) {
            System.out.println("Это великая комета");
        } else {
            System.out.println("Это простая комета");
        }
    }

    @Override
    public double getDiameter() {
        return radius.diameter();
    }

    @Override
    public String toString() {
        return "Comet{" +
                "radius=" + radius +
                ", seenFromEarth=" + seenFromEarth +
                '}';
    }
}
