package com.glybovskij.polymorph;

public final class SpaceUtils {
    private static final double G = Math.pow(6.67, -11);

    private SpaceUtils() {
    }

    public static boolean isPlanet(SpaceObject objects) {
        return objects instanceof Planet;
    }

    public static double gravityForce(SpaceObject objects1, SpaceObject objects2) {
        double r = (objects1.getDiameter() / 2) + (objects2.getDiameter() / 2) * 100000;
        return G * ((objects1.weight * objects2.weight) / Math.pow(r, 2));
    }
}
