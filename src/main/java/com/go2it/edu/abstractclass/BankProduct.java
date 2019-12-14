package com.go2it.edu.abstractclass;

public abstract class BankProduct {
    private String ownerName;
    private int yearOfCreation;
    private double balance;

    public BankProduct(String ownerName, int yearOfCreation, double balance) {
        this.ownerName = ownerName;
        this.yearOfCreation = yearOfCreation;
        this.balance = balance;
    }

    public void getFunds(double sumToGetFromTheClient){   // delete #abstract
        this.addFundsToBalance(sumToGetFromTheClient);
    }

    public abstract double investFunds(double fundsToInvest);

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

    public void addFundsToBalance(double balance){
        this.balance+= balance;
    }
}
