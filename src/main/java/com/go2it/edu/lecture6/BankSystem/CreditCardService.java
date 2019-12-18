package com.go2it.edu.lecture6.BankSystem;

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

    }

    public void withdrawMoney(CreditCard card, double cash) {

        System.out.println("Money has been withdrawn from " + card);
        double newBalance = card.getBalance() + cash;
        System.out.println(" Now, the balance is: " + newBalance);
    }

    public void closeCreditCard() {
        System.out.println("Card was closed");

    }
}
