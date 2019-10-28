package com.go2it.edu.lecture3.methods;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
//        LocalDate currentDay = LocalDate.now();
//        DayOfWeek dayOfWeek = currentDay.getDayOfWeek();
//        String day = dayOfWeek.toString();


        String day = "MONDAY";
//        String day = "TUESDAYS";
//        String day = "WEDNESDAY";
//        String day = "FRIDAY";
//        String day = "SATURDAY";
        System.out.println(day);
        printLeftTillWeekend("MONDAY", 4);


//        String[] weekDays = new String[]{"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
//        int[] daysOff = new int[] {1, 2, 3, 4};
//        for (String weekDay: weekDays) {
//            System.out.println();
//            for (int dayoff: daysOff) {
//                System.out.println(String.format("Verifying day %s and dayoff %d", weekDay, dayoff));
//                printLeftTillWeekend(weekDay, dayoff);
//            }
//        }

    }
    public static void printLeftTillWeekend(String dayOfWeek){

    }

    public static void printLeftTillWeekend(String dayOfWeek, int daysOff) {
        String[] daysleft = daysofweek(dayOfWeek);
        int i = daysleft.length - daysOff;
        if (daysleft.length < daysOff) {
            System.out.println("Your days till weekend less then days off you want to take");
        } else {
            System.out.println("I will take " + daysOff + " days off this week, so my weekend will start " + daysOff + " days earlier - on " + daysleft[i]);
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


