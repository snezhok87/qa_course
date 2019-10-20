package com.go2it.edu.lecture3.methods;
// Tak 3.5 Create methods that will accept the current day of the week and will:
//a. Show on console how many days of the week left till weekend
//b. Return an array with all the days left till weekend
import java.util.Calendar;
import java.util.Date;

public class AcceptCurrentDay {
    public static void main(String[] args) {
       Date currentDate = new Date();
        System.out.println(currentDate);
       int countDaysLeft = 5;
       String[] Days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
       for (int i= 1; i<=countDaysLeft; i ++){
        i = countDaysLeft;
       }
//       System.out.println("There are " + i + " days till the weekend ");
    }

}
