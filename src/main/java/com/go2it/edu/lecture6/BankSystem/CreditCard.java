package com.go2it.edu.lecture6.BankSystem;

import java.time.LocalDate;

public class CreditCard extends BankProduct {
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

}
