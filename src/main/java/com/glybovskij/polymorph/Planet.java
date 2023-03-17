package com.glybovskij.polymorph;

public class Planet extends SpaceObjects {
    boolean isHaveAtmosphere;
    String name;
    Radius radius;

    public Planet(double weight, Radius radius, boolean isHaveAtmosphere, String name) {
        super(weight);
        this.radius = radius;
        this.isHaveAtmosphere = isHaveAtmosphere;
        this.name = name;
    }

    @Override
    public double getDiameter() {
        return radius.diameter(this.radius);
    }

    public void mayBeLive() {
        if (this.isHaveAtmosphere) {
            System.out.println("Планета " + name + " может быть обитаема");
        } else {
            System.out.println("Планета " + name + " вероятнее всего необитаема");
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "isHaveAtmosphere=" + isHaveAtmosphere +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
