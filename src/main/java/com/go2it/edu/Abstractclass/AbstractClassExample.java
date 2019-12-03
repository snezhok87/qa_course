package com.go2it.edu.Abstractclass;

import java.time.LocalDate;

public class AbstractClassExample {
    public static void main(String[] args) {
        BankProduct creditLine = new CreditCard("toto", 2018, 100.00, LocalDate.of(2023, 5, 15), 565656);
        creditLine.addFundsToBalance(100.00);
        creditLine.addFundsToBalance(300.00);
        creditLine.investFunds(50);

        BankProduct saveMoney = new SavingAccount("Saving", 2019,15000, 2,365);
        saveMoney.addFundsToBalance(200.00);
        saveMoney.addFundsToBalance(600.00);
        saveMoney.investFunds(50);

        Promo promoOffer= new Mortgage("Snezhana", 2019, 90000, true, 1200000, 10);
        promoOffer.sumForPromotion(4000, 10);

    }
}