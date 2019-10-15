package com.go2it.edu.lecture2.arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SubStringLoginPassword {

    public static void main(String[] args) {
        String username = "username=Alex";
        String substring1 = username.substring(9, 13);
        System.out.println(substring1);
        String password = "password=xXx";
        String substring2 = password.substring(9, 12);
        System.out.println(substring2);
    }
}
