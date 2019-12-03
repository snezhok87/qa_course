package com.go2it.edu.lecture6;

public class CheckingAccountService {
    public CheckingAccount openCheckingAccount(Customer customer, String ownerName, int yearOfCreation, double balance) {
        System.out.println(" The checking account is opened for " + customer);
        return new CheckingAccount(ownerName, yearOfCreation, balance);
    }

    public void depositMoneyToAccount(CheckingAccount account, double amountOfMoney) {
        System.out.println(" Deposit operation is completed");
        double newBalance = account.getBalance() + amountOfMoney;
        account.setBalance(newBalance);
        System.out.println(account + " is been deposit for " + amountOfMoney + " and new balance is " + newBalance);
    }

    public void withdrawMoney(CheckingAccount account, int withdraw) {
        double balance = account.getBalance();
        if (withdraw < balance && withdraw != 10) {
            System.out.println(withdraw + " money has been withdrawn");
            double newBalance = balance - withdraw;
        } else {
            System.out.println(" This operation cannot been proceed");
        }
    }
}


