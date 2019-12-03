package com.go2it.edu.lecture6;

public class Mortgage extends BankProduct {
    private boolean insurance;
    private int sumForLoan;
    private int period;

    public Mortgage(String ownerName, int yearOfCreation, double balance, boolean insurance, int sumForLoan, int period) {
        super(ownerName, yearOfCreation, balance);
        this.insurance = insurance;
        this.sumForLoan = sumForLoan;
        this.period = period;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public int getSumForLoan() {
        return sumForLoan;
    }

    public void setSumForLoan(int sumForLoan) {
        this.sumForLoan = sumForLoan;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
