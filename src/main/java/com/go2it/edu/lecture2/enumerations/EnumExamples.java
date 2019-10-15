package com.go2it.edu.lecture2.enumerations;

public class EnumExamples {

    public static void main(String[] args) {

        //System.out.println(DaysWeek.valueOf(args[0]));
        String day = args[0];
        DaysWeek dayofweek = DaysWeek.valueOf(day);
        System.out.println(dayofweek);

        int orderNumber = dayofweek.getOrderNumber();
        String shortTitle = dayofweek.getShortTitle();
        System.out.println(orderNumber + "," + shortTitle);
    }

    private enum DaysWeek {
        MONDAY(1, "Mon"), TUESDAY(2, "Tue"), WEDNESDAY(3, "Wed"), THURSDAY(4, "Thu"), FRIDAY(5, "FRI"), SATURDAY(6, "Sat"), SUNDAY(7, "Sun");
        private int orderNumber;
        private String shortTitle;
        //private boolean isDayOff;

        DaysWeek(int on, String st) {
            this.orderNumber = on;
            this.shortTitle = st;
            //this.isDayOff = isDayOff;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public String getShortTitle() {
            return shortTitle;
        }
    }


}