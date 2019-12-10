package com.go2it.edu.lecture6;

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

    public void addMoneyToAccount(SavingAccount account, double cash) {
        System.out.println("Money has been deposited  " + account);
        double newBalance = account.getBalance() + cash;
        System.out.println(" Now, the balance is: " + newBalance);
    }

    public void closeSavingAccount(int periodForSavingAccount) {
        final int BANK_PERIOD = 365;
        if (periodForSavingAccount > BANK_PERIOD) {
            System.out.println("Saving Account was closed");

        }
    }
}
