package com.go2it.edu.lecture3.loops;

import java.util.Scanner;

public class BurgerIndexTest {
    public static void main(String[] args) {

        CostOfLiving[] costOfLivings = {new CostOfLiving("Russia", 25000, 65.00, 3),
                new CostOfLiving("Canada", 3500, 5.00, 2),
                new CostOfLiving("USA", 4500, 3.50, 1)};
        System.out.println("Please enter the country name: ");
//        boolean result = false;
        CostOfLiving actualCountry = null;

        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        for (CostOfLiving cost : costOfLivings) {
            if (userInput.equals(cost.getCountryName())) {
                actualCountry = cost;  //  result = true;
                break;
            }
        }
//        если такая страна в списке есть, то сообщение 1
        if (actualCountry != null) {
            System.out.println("Average citizen from " + actualCountry.getCountryName() + " country, can buy " + actualCountry.getAverageMonthSalary() / actualCountry.getBurgerPrice() + " burgers with this salary." +
                    " It placed  " + actualCountry.getCountryName() + " on the " + actualCountry.getCountryRank() + " place based on the price of burger in the world ");
        } else {
            System.out.println("Please try again");
        }
    }
}

