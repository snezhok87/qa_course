package com.go2it.edu.lecture7.Exception.cardexceptions;

public class Card extends BankProduct {
    private String cardNumber;

    public Card(String ownerName, double balance, String cardNumber) {
        super(ownerName, balance);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "card number " + cardNumber;
    }
}
