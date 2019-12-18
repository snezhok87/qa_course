package com.go2it.edu.lecture7.Exception.cardexceptions;

import com.go2it.edu.lecture6.BankSystem.Customer;

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
        if (card.getBalance() <= moneyToWithdraw) {
            throw new FundsWithdrawalException("Could not withdraw $" + moneyToWithdraw + ". The balance was $ " + card.getBalance());
        }
        System.out.println("Money has been withdrawn from " + card);

        double newBalance = card.getBalance() - moneyToWithdraw;
        card.setBalance(newBalance);
        System.out.println("Now, the balance is: " + newBalance);
    }
}


