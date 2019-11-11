package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class TestFamily {
    public static void main(String[] args) {

        FamilyMember dog = new FamilyMember("Jack", LocalDate.of(2018, 11, 25), 7, "Bone ");
        dog.goAsleep();

        Parent father = new Parent("Dan", LocalDate.of(1983, 10, 5), 2, "Chicken and salad ",2);
        System.out.println("Father's name is " + father.getName() + " and he lives in room: " + father.getRoomNumber());
        father.eat("Chips");

        Parent mother = new Parent("Jesica", LocalDate.of(1987, 5, 25), 5, "Shrimp and rice ",3);
        System.out.println("My mom was born: " + mother.getDateOfBirth());
        mother.listen();

        Child daughter = new Child("Anna", LocalDate.of(2010, 3, 2), 3, "Borsh ", 2, "female");
        daughter.callAnotherFamilyMember("Jack");

    }
}

