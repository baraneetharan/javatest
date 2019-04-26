package com.kgisl.javatest;

import java.util.Scanner;

/**
 * Test1
 */
public class Test1 {
    public static void main(String[] args) {
        // Random rand = new Random();
        int x = new Scanner(System.in).nextInt();

        System.out.println("My name is " + x);
        if (x % 2 == 0) {
            System.out.println("My numbers are " + (x = x / 2) + " ," + (x = x / 2) + "," + " and " + (x = x / 2));
        } else {
            System.out.println("My numbers are " + (x = x * 2) + " ," + (++x) + " and " + (++x));

        }

    }
}