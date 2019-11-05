package com.go2it.edu.lecture4.BacisOfClass;

public class Dog {

    String color;// properties
    int teeth;
    boolean ears;
    String breed;

    public String getColor() {
        return this.color;
    }
    public int getTeeth(){return this.teeth;}
    public boolean getEars(){return this.ears;}
    public String getBreed(){return this.breed;}

    public Dog(String inputColor,
               int inputTeeth,
               boolean inputEars,
               String inputBreed) {
        this.color = inputColor; // in order to create this class Dog we will need to set the value of the new Dog properties
        this.teeth = inputTeeth; // to these input value. Initializing the doq that we are going to output. use THIS
        this.ears = inputEars;
        this.breed = inputBreed;
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
