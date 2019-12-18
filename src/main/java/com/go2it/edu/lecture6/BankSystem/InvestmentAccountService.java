package com.go2it.edu.lecture6.BankSystem;

public class InvestmentAccountService {
    public InvestmentAccount openInvestmentAccount(Customer customer, int yearOfCreation, double balance){
        System.out.println(customer+ " opened the Investment account");
        String name = customer.getName();
        return new InvestmentAccount(name, yearOfCreation, balance);
    }
    public double investMoney(Customer customer, int sumToInvest){
        System.out.println(customer + " invests money: " + sumToInvest);
        return sumToInvest;
    }
}
