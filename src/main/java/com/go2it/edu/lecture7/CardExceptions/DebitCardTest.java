package com.go2it.edu.lecture7.CardExceptions;


import com.go2it.edu.lecture6.Customer;
import com.go2it.edu.lecture6.Person;

import java.time.LocalDate;

    public class DebitCardTest {
    public static void main(String[] args) throws FundsWithdrawalException {
        Person mother = new Person("Kate", LocalDate.of(1964, 3, 25), true);
        Person father = new Person("Alex", LocalDate.of(1964, 6, 30), false);
        Person[] familyMembers = {mother, father};
        Customer customer = new Customer("Snezhana", LocalDate.of(1987, 5, 2), true, familyMembers, 850, 10000);
        CardService newService = new CardService();
        Card newCard = newService.openNewCard(customer, 2019, 50.00,
                LocalDate.of(2022, 12, 25), 123456);
        System.out.println();

        try {
            newService.withdrawMoney(newCard, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FundsWithdrawalException("Could not withdraw money, there is " + newCard.getBalance());
        }

        newService.addMoneyToCard(newCard, 150);
    }

}