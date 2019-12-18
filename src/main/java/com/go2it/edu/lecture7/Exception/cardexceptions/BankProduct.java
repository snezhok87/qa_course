package com.go2it.edu.lecture7.Exception.cardexceptions;

public class BankProduct {
    private String ownerName;
    private double balance;

    public BankProduct(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
