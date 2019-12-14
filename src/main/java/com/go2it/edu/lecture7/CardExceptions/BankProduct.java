package com.go2it.edu.lecture7.CardExceptions;

public class BankProduct {
    private String ownerName;
    private int yearOfCreation;
    private double balance;

    public BankProduct(String ownerName, int yearOfCreation, double balance) {
        this.ownerName = ownerName;
        this.yearOfCreation = yearOfCreation;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
