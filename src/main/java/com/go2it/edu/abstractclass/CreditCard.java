package com.go2it.edu.abstractclass;

import java.time.LocalDate;

public class CreditCard extends BankProduct implements PrivatePersonFinancing{
    private LocalDate expiredDate;
    private long cardNumber;
    private long creditLimit;

    public CreditCard(String name, int yearOfCreation, double balance, LocalDate expiredDate, long cardNumber) {
        super(name, yearOfCreation, balance);
        this.expiredDate = expiredDate;
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    @Override
    public double investFunds(double fundsToInvest) {
        double result = fundsToInvest + fundsToInvest * 0.05;
        System.out.println("Result of investment is " + result);
        return 0;
    }

    @Override
    public double creditPerson(String name) {
        System.out.println(name + "was credited with $50");
        return 50;
    }

}
