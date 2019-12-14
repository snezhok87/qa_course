package com.go2it.edu.lecture7.CardExceptions;

import com.go2it.edu.lecture6.CreditCard;
import com.go2it.edu.lecture6.Customer;
import com.go2it.edu.lecture6.SavingAccount;

import java.time.LocalDate;

public class CardService {

    public Card openNewCard(Customer customer, int yearOfCreation, double balance, LocalDate expiredDate, long cardNumber) {
        System.out.println("New cars has been opened for " + customer);
        String name = " ";
        return new Card(name, yearOfCreation, balance);
    }

    public void addMoneyToCard(Card card, double cash) {
        System.out.println("Money has been deposited  " + card);
        double newBalance = card.getBalance() + cash;
        System.out.println(" Now, the balance is: " + newBalance);
    }

    public void withdrawMoney(Card card, double cash) {
        System.out.println("Money has been withdrawn from " + card);
        double newBalance = card.getBalance() + cash;
        System.out.println(" Now, the balance is: " + newBalance);
    }

}
