package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class Child extends FamilyMember {
    private String gender;
    Parent[] parents;

    public Child(String name, LocalDate dateOfBirth, int roomNumber, String favoriteDish, String gender, Parent[] parents) {
        super(name, dateOfBirth, roomNumber, favoriteDish);
        this.gender = gender;
        this.parents = parents;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }
}
