package com.go2it.edu.lecture8.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {

        Person father = new Person("Sergei", 55, Person.Gender.MALE, new ArrayList<>());
        Person mother = new Person("Svetlana", 48, Person.Gender.FEMALE, new ArrayList<>());
        Person daughter = new Person("Snezha", 21, Person.Gender.FEMALE, new ArrayList<>(Arrays.asList(father, mother)));

      System.out.println("Daughter has family members: " + daughter.getFamilyMembers());

        Person motherInLaw = new Person("Nina",45, Person.Gender.FEMALE, new ArrayList<>());
        System.out.println("New family member: mother-in-law was created  " + motherInLaw);
        daughter.addFamilyMember(motherInLaw);
        System.out.println("Now daughter has " + daughter.getFamilyMembers());

 //       motherInLaw.addFamilyMember(daughter);
 //       System.out.println("Mother-in-law also has a new Family Member " + daughter);


    }
}
