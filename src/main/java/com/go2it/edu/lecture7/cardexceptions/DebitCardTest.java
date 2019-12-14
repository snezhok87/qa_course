package com.go2it.edu.lecture7.cardexceptions;


import com.go2it.edu.lecture6.Customer;
import com.go2it.edu.lecture6.Person;

import java.time.LocalDate;

public class DebitCardTest {


    public static void main(String[] args) throws FundsWithdrawalException {
        Person[] familyMembers = {};
        Customer customer = new Customer("Snezhana", LocalDate.of(1987, 5, 2), true, familyMembers, 850, 10000);
        CardService service = new CardService();

        DebitCard newCard = service.openNewCard(customer, 50.00, "123456789");
        double moneyToWithdraw = 100;

        try {
            service.withdrawMoney(newCard, moneyToWithdraw);
        } catch (FundsWithdrawalException exception) {
            System.out.println(exception.getMessage());
            service.addMoneyToCard(newCard, moneyToWithdraw*2);// add $200
            service.withdrawMoney(newCard, moneyToWithdraw);
        }
    }
}


