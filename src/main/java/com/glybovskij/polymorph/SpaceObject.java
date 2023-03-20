package com.glybovskij.polymorph;

public abstract class SpaceObject {
    protected double weight;

    public SpaceObject(double weight) {
        this.weight = weight;
    }

    public boolean isWightEqual(SpaceObject spaceObjects1, SpaceObject spaceObjects2) {
        return spaceObjects1.weight == spaceObjects2.weight;
    }

    public abstract double getDiameter();
}
