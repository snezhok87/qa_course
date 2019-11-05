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

        FamilyMember father = new FamilyMember();
        father.setName("Dan");
        father.setDateOfBirth(LocalDate.now());
        father.setRoomNumber(2);
        father.setFavoriteDish("Chicken and salad ");
        System.out.println("Father's name is " + father.getName()+ " and he lives in room: " + father.getRoomNumber());
        father.eat("Chips");

        FamilyMember mother = new FamilyMember();
        mother.setName("Jesica");
        mother.setDateOfBirth(LocalDate.now());
        mother.setRoomNumber(5);
        mother.setFavoriteDish("Shrimp and rice ");
        System.out.println("My mom was born: " + mother.getDateOfBirth());
        mother.listen();

        FamilyMember daughter = new FamilyMember();
        daughter.setName("Anna");
        daughter.setDateOfBirth(LocalDate.now());
        daughter.setRoomNumber(3);
        daughter.setFavoriteDish("Borsh ");
        daughter.callAnotherFamilyMember("Jack");

        FamilyMember dog = new FamilyMember();
        dog.setName("Jack");
        dog.setDateOfBirth(LocalDate.now());
        dog.setRoomNumber(7);
        dog.setFavoriteDish("Bone ");
        dog.goAsleep();
    }

}
