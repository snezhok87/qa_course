package com.go2it.edu.lecture6.BankSystem;


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

        CreditCard rbcCard = cardService.openCreditCard(customer, 2018, 1000.00, LocalDate.of(2018, 6, 25), 565655);
        customer.addBankProduct(rbcCard);

        MortgageService mortgageService = new MortgageService();
        mortgageService.openMortgage(customer, 2019, 2500500, 25);


        Customer anotherCustomer = new Customer("Sveta", LocalDate.of(1980, 10, 15), true, familyMembers, 750, 12000);
        anotherCustomer.addFamilyMember(daughter);
        Person[] newFamilyMem = customer.getFamilyMembers();
        System.out.println(customer.getName() + " has new family member: " + Arrays.toString(newFamilyMem));

        SavingAccountService savingAccount = new SavingAccountService();
        SavingAccount allTimeMoney = savingAccount.openSavingAccount(anotherCustomer, 2019, 3500, 2, 365);
        savingAccount.addMoneyToAccount(allTimeMoney, 250);
        anotherCustomer.addBankProduct(allTimeMoney);

        CheckingAccountService checkingAccount = new CheckingAccountService();
        CheckingAccount cheAc = checkingAccount.openCheckingAccount(anotherCustomer, 2019, 1000);
        checkingAccount.depositMoneyToAccount(cheAc, 1000);
        anotherCustomer.addBankProduct(cheAc);

        InvestmentAccountService investmentAccount = new InvestmentAccountService();
        InvestmentAccount studyInvestment = investmentAccount.openInvestmentAccount(anotherCustomer, 2015, 2500.50);
        investmentAccount.investMoney(anotherCustomer, 1000);
        anotherCustomer.addBankProduct(studyInvestment);

        CreditCard myCard = new CreditCard("Snezhana", 2019, 50.00, LocalDate.of(2022, 12, 28), 123456789);


    }
}

