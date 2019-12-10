package com.go2it.edu.lecture7.Task7part1;

import java.sql.SQLException;

public class ExceptionTest {
    public static void main(String[] args)
            throws SQLException {
        methodA();
        System.out.println("Call unreachable method ");
    }

    static void methodA() throws SQLException {
        methodB();
    }

    static void methodB() throws SQLException {
        throw new SQLException();
    }

}
