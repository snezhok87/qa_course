package com.go2it.edu.lecture6;

import java.time.LocalDate;
import java.util.Arrays;

public class Bank {
    public static void main(String[] args) {

        Person mother = new Person("Kate", LocalDate.of(1964, 3, 25), true);
        Person father = new Person("Alex", LocalDate.of(1964, 6, 30), false);
        Person son = new Person("Dan", LocalDate.of(2010, 5, 5), false);
        Person daughter = new Person("Anna", LocalDate.of(2015, 3, 5), false);
        Person[] familyMembers = {mother, father};

        Customer customer = new Customer("Snezhana", LocalDate.of(1987, 5, 2), true, familyMembers, 850, 10000);
        customer.addFamilyMember(son);
        Person[] newFamilyMembers = customer.getFamilyMembers();
        System.out.println("Family members: " + Arrays.toString(newFamilyMembers));

        CreditCardService cardService = new CreditCardService();
        CreditCard tdCard = cardService.openCreditCard(customer, 2019, 4500, LocalDate.of(2022, 5, 30), 12345678);
        customer.addBankProduct(tdCard);
        System.out.println("This card get balance: " + tdCard.getBalance() + " and the name holder is: " + tdCard.getOwnerName());

        SavingAccountService savingAccount = new SavingAccountService();
        SavingAccount allTimeMoney = savingAccount.openSavingAccount(customer, 2019, 3500, 2, 365);
        customer.addBankProduct(allTimeMoney);

        Customer anotherCustomer = new Customer("Sveta", LocalDate.of(1980, 10, 15), true, familyMembers, 750, 12000);
        anotherCustomer.addFamilyMember(daughter);
        Person[] newFamilyMem = customer.getFamilyMembers();
        System.out.println(customer.getName() + " has new family member: " + Arrays.toString(newFamilyMem));

        CreditCard rbcCard = cardService.openCreditCard(customer, 2018, 1000.00, LocalDate.of(2018, 6, 25), 565655);
        anotherCustomer.addBankProduct(rbcCard);
        anotherCustomer.addBankProduct(tdCard);


        MortgageService mortgageService = new MortgageService();
        Mortgage homeLoan= mortgageService.applyMortgage(anotherCustomer, 2019, 1500,true, 25000, 365);
        anotherCustomer.addBankProduct(homeLoan);
    }

}
