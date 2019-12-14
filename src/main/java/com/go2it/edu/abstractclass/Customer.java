package com.go2it.edu.abstractclass;

import java.time.LocalDate;

public class Customer extends Person {
    private Person[] familyMembers;
    private BankProduct[] bankProducts;
    private int creditScore;
    private int ownBalance;

    public Customer(String name, LocalDate dateOfBirth, boolean canadianResident, Person[] familyMembers, int creditScore, int ownBalance) {
        super(name, dateOfBirth, canadianResident);
        this.familyMembers = familyMembers;
        this.creditScore = creditScore;
        this.ownBalance= ownBalance;
        //this.bankProducts = bankProducts;
    }

    public Person[] getFamilyMembers() {
        return familyMembers;
    }

    public BankProduct[] getBankProducts() {
        return bankProducts;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getOwnBalance() {
        return ownBalance;
    }

    public void setOwnBalance(int ownBalance) {
        this.ownBalance = ownBalance;
    }

    public void addFamilyMember(Person newFamilyMember) {
        Person[] familyMembers = new Person[this.familyMembers.length + 1];
        for (int i = 0; i < this.familyMembers.length; i++) {
            familyMembers[i] = this.familyMembers[i];
        }
        familyMembers[this.familyMembers.length] = newFamilyMember;
        this.familyMembers=familyMembers;
    }

    public void addBankProduct(BankProduct newBankProduct) {
        BankProduct[] bankProducts= new BankProduct[this.bankProducts.length + 1];
        for (int i = 0; i < this.bankProducts.length; i++){
            bankProducts[i] = this.bankProducts[i];
                    }
        bankProducts[this.bankProducts.length] = newBankProduct;
        this.bankProducts = bankProducts;
    }
}
