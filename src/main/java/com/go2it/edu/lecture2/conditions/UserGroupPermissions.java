package com.go2it.edu.lecture2.conditions;

// User group will be stored (to limit access to resources). Show corresponding message with user's group title and user permission.
// Data to work with:
// Alex|qwertY1|Administrator
// Mark|ewq|Customer service
// Lesya|gazS|Analyst
// Petro|1234|Customer
public class UserGroupPermissions {
    public static void main(String[] args) {
        String credentials = args[0] + "|" + args[1] + "|" + args[2];
        String[] correctUsernames = {"Alex", "Mark", "Lesya", "Petro"};
        String[] correctPasswords = {"qwertY1", "ewq", "gazS", "1234"};
        String[] correctGroups = {"Administrator", "Customer service", "Analyst", "Customer"};
        String[] correctPermissions = {"you have all the permission. ",  "you have specific permission. ",
                "you have reports permissions. ", "you have view and buy permissions. "};
        int pipeIndex1 = credentials.indexOf("|");
        int pipeIndex2 = credentials.indexOf("|", pipeIndex1+1);
  //      System.out.println(pipeIndex1);
  //      System.out.println(pipeIndex2);

        String username = credentials.substring(0, pipeIndex1);
        String password = credentials.substring(pipeIndex1 + 1, pipeIndex2);
        String group = credentials.substring(pipeIndex2 + 1);

        for (int i = 0; i < correctUsernames.length; i++) {
            if (correctUsernames[i].equals(username) && correctPasswords[i].equals(password) && correctGroups[i].equals(group)) {
                System.out.println("Welcome, " + correctUsernames[i] + "! " + "Your group is " + correctGroups[i] + " and " + correctPermissions[i]);
            }
        }
    }
}

