package com.glybovskij.polymorph;

public abstract class SpaceObjects {
    double weight;

    public SpaceObjects(double weight) {
        this.weight = weight;
    }

    public boolean isWightEqual(SpaceObjects spaceObjects1, SpaceObjects spaceObjects2) {
        return spaceObjects1.weight == spaceObjects2.weight;
    }

    public abstract double getDiameter();
}
