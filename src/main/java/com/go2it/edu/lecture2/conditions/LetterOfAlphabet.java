package com.go2it.edu.lecture2.conditions;

public class LetterOfAlphabet {
    public static void main(String[] args) {
        char letter = 'y';
        switch (letter) {
            case 'a': {
                System.out.println("The letter A is on the position 1 in the alphabet");
                break;
            }
            case 'b': {
                System.out.println("The letter B is on the position 2 in the alphabet");
                break;
            }
            case 'c': {
                System.out.println("The letter C is on the position 3 in the alphabet");
                break;
            }
            case 'x': {
                System.out.println("The letter X is on the position 24 in the alphabet");
                break;
            }
            case 'y': {
                System.out.println("The letter Y is on the position 25 in the alphabet");
                break;
            }
            case 'z': {
                System.out.println("The letter Z is on the position 26 in the alphabet");
                break;
            }
            default: {
                System.out.println("The letter is somewhere in the middle of alphabet.");
            }
        }
    }
}