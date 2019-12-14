package com.go2it.edu.lecture7.cardexceptions;

import com.go2it.edu.lecture6.Customer;

public class CardService {

    public DebitCard openNewCard(Customer customer, double balance, String cardNumber) {
        System.out.println("New cars has been opened for " + customer);
        String name = customer.getName();
        return new DebitCard(name, balance, cardNumber);
    }

    public void addMoneyToCard(Card card, double cash) {
        System.out.println("$" + cash + " has been deposited to " + card);
        double newBalance = card.getBalance() + cash;
        card.setBalance(newBalance);
        System.out.println("The balance is: " + newBalance);
    }

    public void withdrawMoney(Card card, double moneyToWithdraw) throws FundsWithdrawalException {
        if (card.getBalance() >= moneyToWithdraw) {
            System.out.println("Money has been withdrawn from " + card);

        } else {
            throw new FundsWithdrawalException("Could not withdraw $" + moneyToWithdraw + ". The balance was $ " + card.getBalance());

        }

        double newBalance = card.getBalance() - moneyToWithdraw;
        card.setBalance(newBalance);
        System.out.println("Now, the balance is: " + newBalance);
    }

}

