package com.glybovskij.polymorph;

public interface Officiality {
    default boolean isOfficial(Radius radius, String material) {
        return radius.getRadius() >= 20 && material.equals("stone");
    }
}
