package com.go2it.edu.lecture6;

import java.time.LocalDate;

public class Customer extends Person {
    private Person[] familyMembers;
    private BankProduct[] bankProducts;
    private int creditScore;
    private int ownBalance;
    private int salary;

    public Customer(String name, LocalDate dateOfBirth, boolean canadianResident, Person[] familyMembers, int creditScore, int ownBalance) {
        super(name, dateOfBirth, canadianResident);
        this.familyMembers = familyMembers;
        this.creditScore = creditScore;
        this.ownBalance = ownBalance;
        this.bankProducts = new BankProduct[0];
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addFamilyMember(Person newFamilyMember) {
        Person[] familyMembers = new Person[this.familyMembers.length + 1];
        for (int i = 0; i < this.familyMembers.length; i++) {
            familyMembers[i] = this.familyMembers[i];
        }
        familyMembers[this.familyMembers.length] = newFamilyMember;
        this.familyMembers = familyMembers;
    }

    // создаем метод добавить банковский продукт
    public void addBankProduct(BankProduct newBankProduct) {
        // создаем переменную bankProducts и присваеваем ей новый массив класса BankProduct с размером старого массива + 1
        BankProduct[] bankProducts = new BankProduct[this.bankProducts.length + 1];
        // создаем цикл, где  переменной i присваивается значение 0, сравнивается с длинной массива bankProduct, и увеличивается на 1
        for (int i = 0; i < this.bankProducts.length; i++) {
            // ячейке нового массива bankProducts с индексом i присваивается i-й элемент (ячейка) существующего массива this.bankProducts
            bankProducts[i] = this.bankProducts[i];
        }
        // новую переменную newBankProduct присваиваю/копирую в последнюю ячейку нового массива bankProducts
        // a <--- b
        bankProducts[bankProducts.length - 1] = newBankProduct;
        // новый массив bankProducts перезаписывает существующий this.bankProducts
        // если не перезаписать, то новая переменная после выполнения метода исчезнет, т.к. ее область видимости завершится.
        this.bankProducts = bankProducts;
    }
}
