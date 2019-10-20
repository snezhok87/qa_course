package com.go2it.edu.lecture3.loops;

//Task 3.2. Create a loop that will show only odd (can be divided by 2 without leftover)
//elements from the array

public class DevideByTwo {
    public static void main(String[] args) {
        int[] array = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        //System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
                System.out.println("Elements of given array present on odd position: " + array[i]);
//            }
//            if (array[i] % 2 == 0) { // Задание: показать все некратные числа (в добавок к заданию о кратных числах)
//                System.out.println("Elements of given array present on even position: " + array[i]);
//            }
        }
    }
}

