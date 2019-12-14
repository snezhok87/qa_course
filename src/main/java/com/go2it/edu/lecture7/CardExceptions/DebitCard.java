package com.go2it.edu.lecture7.CardExceptions;

public class DebitCard extends Card {
    private  int cardNumber;

    public DebitCard(String ownerName, int yearOfCreation, double balance, int cardNumber) {
        super(ownerName, yearOfCreation, balance);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
