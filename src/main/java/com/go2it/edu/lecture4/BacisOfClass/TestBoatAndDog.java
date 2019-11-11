package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class TestBoatAndDog {
    public static void main(String[] args) {
//        Boat smallYacht = new Boat();// 3 way- constructor
//
//        smallYacht.title = "Victory"; // 1 way- not right way, do not use
//        System.out.println(smallYacht.title);
//
//        smallYacht.setTitle("Victory"); // 2 way- we call method set and pass variable
//        smallYacht.setHasSail(true);
//        System.out.println("Small yacht: " + smallYacht.getTitle() + " , does it have sail - " + smallYacht.isHasSail());
//
//        Boat cruiseLiner = new Boat();
//        cruiseLiner.setTitle("Grand Elizabeth");
//        cruiseLiner.setHasSail(false);
//        System.out.println("Cruise Liner: " + cruiseLiner.getTitle() + " , does it have sail - " + cruiseLiner.isHasSail());

        Dog americanLeopard = new Dog("white", 14, true, "Poodle", "male", 4);
        System.out.println("My dog has " + americanLeopard.getTeeth() + " teeth");
        americanLeopard.sleep(5);

        Dog myDog = new Dog("brown", 20, true, "Broholmer", "female", 4);
        System.out.println("My dog is " + myDog.getColor() + " color");
        myDog.sleep(10);
        myDog.run(false);
        myDog.play(Dog.ToysToPlay.BALL);

        Dog poodle = new Dog("female", "Poodle");
        poodle.play(Dog.ToysToPlay.STICK);
        poodle.setColor("white");
        System.out.println("The color of poodle is " + poodle.getColor());

        Dog puppyCollie = new Dog("female", "Collie", 30);
        System.out.println("My puppy has " + puppyCollie.getTeeth() + " teeth");

    }
}
