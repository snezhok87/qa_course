package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;
import java.util.Arrays;

public class FamilyApplication {
    public static void main(String[] args) {

        FamilyMember dog = new FamilyMember("Jack", LocalDate.of(2018, 11, 25), 7, "Bone ");
        dog.goAsleep();

        LocalDate fatherBirthday = LocalDate.of(1983, 10, 5);
        Parent father = new Parent("Alex", fatherBirthday, 2, "Chicken and salad ", 1);
        System.out.println("Father's name is " + father.getName() + " and he lives in room: " + father.getRoomNumber());
        father.eat("Chips");

        LocalDate motherBirthday = LocalDate.of(1987, 5, 25);
        Parent mother = new Parent("Jane", motherBirthday, 5, "Shrimp and rice ", 1);
        System.out.println("My mom was born: " + mother.getDateOfBirth());
        mother.listen();

        LocalDate sonBirthday = LocalDate.of(2010, 3, 2);
//        Parent[] parents = {father,mother};
        Child son = new Child("Daniil", sonBirthday, 3, "Borsh ", "male", new Parent[]{father, mother});
        son.callAnotherFamilyMember("Jack");
        father.setChildren(new Child[]{son});
        mother.setChildren(new Child[]{son});

        print(father, mother);
    }

    public static void print(Parent father, Parent mother) {
        // without ln, in console the lines merge together
        System.out.print(father.getName() + " has " + father.getNumberOfChildren() + " kid: ");
        for (Child kid : father.getChildren()) {
            System.out.print(kid.getName());
        }
        System.out.print(mother.getName() + " has " + mother.getNumberOfChildren() + " kid: ");
        for (Child kid : mother.getChildren()) {
            System.out.print(kid.getName());
        }

    }
}

