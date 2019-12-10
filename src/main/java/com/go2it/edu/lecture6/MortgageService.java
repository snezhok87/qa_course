package com.go2it.edu.lecture6;

import java.time.LocalDate;
import java.time.Period;

public class MortgageService {
    public void openMortgage(Customer customer, int yearOfCreation, int sumForLoan, int period) {
        LocalDate currentDay = LocalDate.now();
        LocalDate dateOfBirth = customer.getDateOfBirth();
        Period age = Period.between(dateOfBirth, currentDay);
        System.out.println(age.getYears());
        String name = customer.getName();
        if (customer.isCanadianResident() && age.getYears() >= 18) {
            System.out.println("The mortgage has been applied for " + customer);

        } else {
            if (!customer.isCanadianResident()) {
                System.out.println(customer + " should get Canadian residence");
            }
            if (age.getYears() < 18) {
                System.out.println(customer + " needs to be older.");
            }

        }
    }

}

