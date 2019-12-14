package com.go2it.edu.abstractclass;

public class SavingAccountService {

    public SavingAccount openSavingAccount(Customer customer, int yearOfCreation, double balance, int rateForSavingAccount, int periodForSavingAccount) {
        final int BALANCE = 1500;
        if (customer.isCanadianResident() && customer.getOwnBalance() >= BALANCE) {
            System.out.println("The saving account has been opened for " + customer);
            String name = customer.getName();
            return new SavingAccount(name, yearOfCreation, balance, rateForSavingAccount, periodForSavingAccount);
        } else {

            if (!customer.isCanadianResident()) {
                System.out.println(customer + " should get Canadian residence");
            }
            if (customer.getOwnBalance() <= BALANCE) {
                System.out.println(customer + " needs to save up money.");
            }
        }
        return null;
    }

    public void closeSavingAccount(int periodForSavingAccount) {
        final int BANK_PERIOD = 365;
        if (periodForSavingAccount > BANK_PERIOD) {
            System.out.println("Saving Account was closed");

        }
    }
}
