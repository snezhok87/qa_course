package com.go2it.edu.lecture2.arrays;

public class Graphics {
    public static void main(String[] args) {
        double[] sines, cosines;
            sines = new double[360];
            cosines = new double[360];
            for (int i = 0; i < sines.length; i++) {
                sines[i] = Math.sin(Math.toRadians(i));
                cosines[i] = Math.cos(Math.toRadians(i));
            }
        }
    }


