package com.go2it.edu.lecture5.Hierarchy.AnimalHierarchy;

public class Predator extends Animal {
    private String typeOfPredator;

    public Predator(boolean vegetarian, int numberOfLegs, String food, String cover, boolean swimmer) {
        super(vegetarian, numberOfLegs, food, cover, swimmer);
    }

    public String getTypeOfPredator() {
        return typeOfPredator;
    }
}
