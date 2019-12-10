package com.go2it.edu.lecture6;

import java.time.LocalDate;

public class CreditCardService {

    public CreditCard openCreditCard(Customer customer, int yearOfCreation, double balance, LocalDate expiredDate, long cardNumber) {
        final int CREDIT_SCORE = 600; //To turn an ordinary variable into a constant, you have to use the keyword "final."
        if (!customer.isCanadianResident()) {
            System.out.println(customer + " should get Canadian residence");
        }
        if (customer.getCreditScore() <= CREDIT_SCORE) {
            System.out.println(customer + " needs to improve the credit score.");
        }
        return null;

  //      final int INCOME_SALARY = 70000;
  //      final int NUMBER_OF_CREDITCARD = 2;

 //       if (customer.isCanadianResident() && customer.getCreditScore() >= CREDIT_SCORE) {
//            System.out.println("The new card has been opened for " + customer);
  //          String name = customer.getName();
    //        return new CreditCard(name, yearOfCreation, balance, expiredDate, cardNumber);
//            how to add compare && >=NUMBER_OF_CREDITCARD
//            if (customer.getSalary() >= INCOME_SALARY) {
//                System.out.println("New credit card with 10000 limit was issued for " + customer + name);
//            }
//        } else {
//
//
//        }

//        public void closeCreditCard() {
//            System.out.println("Card was closed");
//
//        }
    }
}