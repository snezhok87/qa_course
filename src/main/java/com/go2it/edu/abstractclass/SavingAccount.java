package com.go2it.edu.abstractclass;

public class SavingAccount extends BankProduct {
    private int rateForSavingAccount;
    private int periodForSavingAccount;

    public SavingAccount(String ownerName, int yearOfCreation, double balance, int rateForSavingAccount, int periodForSavingAccount) {
        super(ownerName, yearOfCreation, balance);
        this.rateForSavingAccount = rateForSavingAccount;
        this.periodForSavingAccount = periodForSavingAccount;
    }

    public int getRateForSavingAccount() {
        return rateForSavingAccount;
    }

    public void setRateForSavingAccount(int rateForSavingAccount) {
        this.rateForSavingAccount = rateForSavingAccount;
    }

    public int getPeriodForSavingAccount() {
        return periodForSavingAccount;
    }

    public void setPeriodForSavingAccount(int periodForSavingAccount) {
        this.periodForSavingAccount = periodForSavingAccount;
    }

    @Override
    public double investFunds(double fundsToInvest) {
        double result = fundsToInvest + fundsToInvest * 0.15;
        System.out.println("Result of investment is " + result);
        return 0;
    }


}
