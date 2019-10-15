package com.go2it.edu.lecture2.enumerations;

public class SwichDays {
    public static void main(String[] args) {
        String dayofweek = args[0];
        switch (dayofweek) {
            case "Monday": {
                int number = DaysWeek.MONDAY.getOrderNumber();
                String title = DaysWeek.MONDAY.getShortTitle();
                System.out.println(dayofweek + ", " + number + ", " + title);
                break;
            }
            case "Tuesday": {
                int number = DaysWeek.TUESDAY.getOrderNumber();
                String title = DaysWeek.TUESDAY.getShortTitle();
                System.out.println(dayofweek + ", " + number + ", " + title);
            }
            case "Wednesday":{
                int number = DaysWeek.WEDNESDAY.getOrderNumber();
                String title = DaysWeek.WEDNESDAY.getShortTitle();
                System.out.println(dayofweek + ", " + number + ", " + title);
            }
            case "Thursday":{
                int number = DaysWeek.THURSDAY.getOrderNumber();
                String title = DaysWeek.THURSDAY.getShortTitle();
                System.out.println(dayofweek + ", " + number + ", " + title);
            }
        }


    }

    private enum DaysWeek {
        MONDAY(1, "Mon"), TUESDAY(2, "Tue"), WEDNESDAY(3, "Wed"), THURSDAY(4, "Thu"), FRIDAY(5, "FRI"), SATURDAY(6, "Sat"), SUNDAY(7, "Sun");
        private int orderNumber;
        private String shortTitle;


        DaysWeek(int on, String st) {
            this.orderNumber = on;
            this.shortTitle = st;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public String getShortTitle() {
            return shortTitle;
        }
    }

}
