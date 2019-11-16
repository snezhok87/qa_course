package com.go2it.edu.lecture5.AnimalHierarchy;

public class Insect extends Animal{
    private String title;

    public Insect(boolean vegetarian, int numberOfLegs, String food, String cover, boolean swimmer) {
        super(vegetarian, numberOfLegs, food, cover, swimmer);
    }

    public String getTitle() {
        return title;
    }
}
