package com.go2it.edu.lecture3.loops;

public class CostOfLiving {
    private String countryName;
    private int averageMonthSalary;
    private double burgerPrice;
    private int countryRank;

    public CostOfLiving(String countryName, int averageMonthSalary, double burgerPrice, int countryRank) {
        this.countryName = countryName;
        this.averageMonthSalary = averageMonthSalary;
        this.burgerPrice = burgerPrice;
        this.countryRank = countryRank;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getAverageMonthSalary() {
        return averageMonthSalary;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }
    public int getCountryRank(){
        return countryRank;
    }
}
