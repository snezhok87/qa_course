package com.go2it.edu.lecture5.Hierarchy.AnimalHierarchy;

public class Bird extends Animal{
    private String title;

    public Bird(boolean vegetarian, int numberOfLegs, String food, String cover, boolean swimmer) {
        super(vegetarian, numberOfLegs, food, cover, swimmer);
    }

    public String getTitle() {
        return title;
    }
}
