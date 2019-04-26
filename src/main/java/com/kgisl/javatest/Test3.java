package com.kgisl.javatest;

/**
 * Test3
 */

public class Test3 {
    public static void main(String[] args) {
        String s1 = "Kari ";
        String s2 = "Laitinen";
        String s3 = s1.concat(s2);
        System.out.println("first name length=" + s1.length());
        System.out.println("last name length=" + s2.length());
        // System.out.println("full name length="+s3.length());
        System.out.println(s3);
        int speed = 58;
        double distance = 657.5;
        System.out.println("At 58 mph, it will take " + distance / speed + " hours to travel 657.5 miles");

    }

}