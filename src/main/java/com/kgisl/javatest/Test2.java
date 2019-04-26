package com.kgisl.javatest;

import java.util.Scanner;

/**
 * Test
 */
public class Test2 {

    public static void main(String[] args) {
        int var_x = 10;
        char c = new Scanner(System.in).next().charAt(0);

        // char c = 'm';

        switch (c) {
        case 'm':
            System.out.println("m to km= " + var_x * 1.60934);
            break;
        case 'k':
            System.out.println("km to m= " + var_x * 0.621371);
            break;
        default:
            System.out.println("outside the input key");
            break;
        }

    }
}