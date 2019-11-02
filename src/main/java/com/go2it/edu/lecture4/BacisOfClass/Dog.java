package com.go2it.edu.lecture4.BacisOfClass;

public class Dog {

    private String color;
    private int teeth;
    private int ears;
    private String breed;


    public Dog(String color, int teeth, int ears, String breed) {
        color = color;
        teeth = teeth;
        ears = ears;
        breed = breed;
    }

    public String getColor() {
        return color;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getEars() {
        return ears;
    }

    public String getBreed() {
        return breed;
    }
}
