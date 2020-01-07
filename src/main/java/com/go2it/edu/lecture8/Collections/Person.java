package com.go2it.edu.lecture8.Collections;

import java.util.ArrayList;
import java.util.List;

public class  Person {
    private String name;
    private int age;
    private Gender gender;
    private List<Person> familyMembers; // this is new property familyMembers of type ArrayList which can contain only Person

    public enum Gender {
        FEMALE, MALE
    }

    public Person(String name, int age, Gender gender, ArrayList<Person> familyMembers) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.familyMembers = familyMembers;
    }

    public List<Person> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(Person person) {
        familyMembers.add(person); // this method will add new person to Array list of family members
        if (!person.getFamilyMembers().contains(this))
            person.addFamilyMember(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
