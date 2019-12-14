package com.go2it.edu.abstractclass;

public class Mortgage extends BankProduct implements Promo{
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
    @Override
    public double investFunds(double fundsToInvest) {
        double result = fundsToInvest + fundsToInvest * 0.15;
        System.out.println("Result of investment is " + result);
        return 0;
    }

    @Override
    public double sumForPromotion(double spendingMoney, double sumToGetPromo) {
        final int SET_MONEY = 5000;
        if(spendingMoney> SET_MONEY){
            System.out.println("Customer spent " + spendingMoney + " money and can get a promo");
            return sumToGetPromo;
        }else {
            System.out.println("Customer cannot apply for Promo");
        }
        return sumToGetPromo;
    }
}
