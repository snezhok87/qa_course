package com.go2it.edu.lecture3.methods;
// Tak 3.5 Create methods that will accept the current day of the week and will:
//a. Show on console how many days of the week left till weekend
//b. Return an array with all the days left till weekend


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class AcceptCurrentDay {
    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();
        DayOfWeek dayOfWeek = currentDay.getDayOfWeek();
        String day = dayOfWeek.toString();
        System.out.println(day);

        printLeftTillWeekend(day);
        String[] daysofweek = daysofweek(day);
        System.out.println(Arrays.toString(daysofweek));

    }

    public static void printLeftTillWeekend(String day) {
        switch (day) {
            case "MONDAY": {
                int number = 4;
                System.out.println("There are " + number + " days till the weekend ");
                break;
            }
            case "TUESDAY": {
                int number = 3;
                System.out.println("There are " + number + " days till the weekend ");
                break;
            }
            case "WEDNESDAY": {
                int number = 2;
                System.out.println("There are " + number + " days till the weekend ");
                break;
            }
            case "THURSDAY": {
                int number = 1;
                System.out.println("There are " + number + " days till the weekend ");
                break;
            }
            case "FRIDAY":
            case "SUNDAY": {
                int number = 0;
                System.out.println("There are " + number + " days till the weekend ");
                break;
            }
        }
    }

    public static String[] daysofweek(String day) {
        String[] daysLeft = {};
        switch (day) {
            case "MONDAY": {
                daysLeft = new String[]{"Tuesday", "Wednesday", "Thursday", "Friday"};
                break;
            }
            case "TUESDAY": {
                daysLeft = new String[]{"Wednesday", "Thursday", "Friday"};
                break;
            }
            case "WEDNESDAY": {
                daysLeft = new String[]{"Thursday", "Friday"};
                break;
            }
            case "THURSDAY": {
                daysLeft = new String[]{"Friday"};
                break;
            }
            case "FRIDAY":
            case "SATURDAY":
            case "SUNDAY": {
                daysLeft = new String[]{};
                int number = 0;
                break;
            }
        }
        return daysLeft;
    }
}
