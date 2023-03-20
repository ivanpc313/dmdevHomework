package com.glybovskij.polymorph;

public class Planet extends SpaceObject {
    private boolean hasAtmosphere;
    private String name;
    private Radius radius;

    public Planet(double weight, Radius radius, boolean isHaveAtmosphere, String name) {
        super(weight);
        this.radius = radius;
        this.hasAtmosphere = isHaveAtmosphere;
        this.name = name;
    }

    @Override
    public double getDiameter() {
        return radius.diameter();
    }

    public void mayBeLive() {
        if (this.hasAtmosphere) {
            System.out.println("Планета " + name + " может быть обитаема");
        } else {
            System.out.println("Планета " + name + " вероятнее всего необитаема");
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "isHaveAtmosphere=" + hasAtmosphere +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
