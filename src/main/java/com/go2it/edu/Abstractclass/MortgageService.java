package com.go2it.edu.Abstractclass;

import java.time.LocalDate;

public class MortgageService {
    public Mortgage applyMortgage(Customer customer, int yearOfCreation, double balance, boolean insurance, int sumForLoan, int period) {
        final LocalDate AGE = LocalDate.ofYearDay(1994, 25);
        if (customer.isCanadianResident() && customer.dateOfBirth.equals(AGE)) {
            System.out.println("The mortgage has been applied for " + customer);
            String name = customer.getName();
            return new Mortgage(name, yearOfCreation, balance, insurance, sumForLoan, period);
        } else {
            if (!customer.isCanadianResident()) {
                System.out.println(customer + " should get Canadian residence");
            }
            if (!customer.dateOfBirth.equals(AGE)) {
                System.out.println(customer + " needs to be older.");
            }
        }
        return null;
    }

}
