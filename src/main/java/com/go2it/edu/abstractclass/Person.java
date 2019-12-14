package com.go2it.edu.abstractclass;

import java.time.LocalDate;

public class Person {
    private String name;
    LocalDate dateOfBirth;
    private boolean canadianResident;

    public Person(String name, LocalDate dateOfBirth, boolean canadianResident) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.canadianResident = canadianResident;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isCanadianResident() {
        return canadianResident;
    }

    public void setCanadianResident(boolean canadianResident) {
        this.canadianResident = canadianResident;
    }

    @Override
    public String toString() {
        return name;
    }
}


