package com.go2it.edu.lecture4.BacisOfClass;

public class Dog {

    String color;// properties
    int teeth;
    boolean ears;
    String breed;
    String gender;
    int paws;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public boolean getEars() {
        return this.ears;
    }

    public String getBreed() {
        return this.breed;
    }

    public Dog(String color, int teeth, boolean ears, String breed, String gender, int paws) {
        this.color = color; // in order to create this class Dog we will need to set the value of the new Dog properties
        this.teeth = teeth; // to these input value. Initializing the doq that we are going to output. use THIS
        this.ears = ears;
        this.breed = breed;
        this.gender = gender;
        this.paws = paws;
    }

    //the main  constructor for healthy brown dog
    public Dog(String gender, String breed) {
        this.gender = gender;
        this.breed = breed;
        this.paws = 4;
        this.ears = true;
        this.color = "Brown";
    }
    // this constructor for puppy dog
    public Dog(String gender, String breed, int teeth) {
        this(gender, breed); //to call the main constructor
        this.teeth = 12;
    }

    public void sleep(int sleepingHours) {
        System.out.println("This dog will sleep " + sleepingHours + " hours");
    }

    public void run(boolean runFast) {
        if (runFast) {
            System.out.println("This dog is running fast");
        } else {
            System.out.println("This dog is running slow");
        }
    }

    public void bark() {
        System.out.println("WOOF-WOOF!");
    }

    public enum ToysToPlay {
        BALL, STICK, BONE
    }

    public void play(ToysToPlay toy) {
        System.out.println("This dog is playing with a " + toy);
    }

}
