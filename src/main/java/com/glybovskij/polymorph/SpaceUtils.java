package com.glybovskij.polymorph;

import java.awt.*;

public final class SpaceUtils {
    private static final double G = Math.pow(6.67, -11);

    private SpaceUtils() {
    }

    public static boolean isPlanet(SpaceObjects objects) {
        return objects instanceof Planet;
    }

    public static double gravityForce(SpaceObjects objects1, SpaceObjects objects2) {
        double force;
        double R = (objects1.getDiameter() / 2) + (objects2.getDiameter() / 2) * 100000;

        force = G * ((objects1.weight * objects2.weight) / Math.pow(R, 2));
        return force;
    }
}
