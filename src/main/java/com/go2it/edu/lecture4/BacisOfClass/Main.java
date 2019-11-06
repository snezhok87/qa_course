package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class Main {
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

        Dog puppyDog = new Dog("white", 14, true, "Poodle");
        System.out.println("My dog has " + puppyDog.getTeeth() + " teeth");
        puppyDog.sleep(5);
        Dog myDog = new Dog("brown", 20, true, "Broholmer");
        System.out.println("My dog is " + myDog.getColor() + " color");
        myDog.sleep(10);
        myDog.run(false);
        myDog.play(Dog.ToysToPlay.BALL);

        FamilyMember father = new FamilyMember("Dan", LocalDate.of(1983,10,5),2,"Chicken and salad ");
        System.out.println("Father's name is " + father.getName()+ " and he lives in room: " + father.getRoomNumber());
        father.eat("Chips");

        FamilyMember mother = new FamilyMember("Jesica", LocalDate.of(1987,5,25), 5,"Shrimp and rice " );
        System.out.println("My mom was born: " + mother.getDateOfBirth());
        mother.listen();

        FamilyMember daughter = new FamilyMember("Anna", LocalDate.of(2010,3,2), 3, "Borsh ");
        daughter.callAnotherFamilyMember("Jack");

        FamilyMember dog = new FamilyMember("Jack", LocalDate.of(2018,11,25),7,"Bone ");
        dog.goAsleep();
    }

}
