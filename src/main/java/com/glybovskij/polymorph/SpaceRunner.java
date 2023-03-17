package com.glybovskij.polymorph;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet(33, new Radius(15), true, "Earth");
        planet1.mayBeLive();
        System.out.println(planet1);

        System.out.println();
        Meteorite meteorite1 = new Meteorite(33, 562, true, new Radius(54));
        meteorite1.isDangerous();
        System.out.println(meteorite1);

        System.out.println();
        Asteroid asteroid1 = new Asteroid(65, "stone", 7784, new Radius(764));
        System.out.println(asteroid1.appropriateNumber());
        System.out.println(asteroid1);

        System.out.println();
        Comet comet1 = new Comet(567.5, new Radius(52), false);
        comet1.isGreatComet();
        System.out.println(comet1);

        System.out.println();
        System.out.println(planet1.isWightEqual(planet1, meteorite1));
        System.out.println(meteorite1.getDiameter());
        System.out.println(SpaceUtils.isPlanet(planet1));
        System.out.println(SpaceUtils.isPlanet(meteorite1));
        System.out.println(SpaceUtils.gravityForce(planet1, meteorite1));
    }
}
