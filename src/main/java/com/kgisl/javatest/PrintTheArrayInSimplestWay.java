package com.kgisl.javatest;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Printthearrayinsimplestway
 */
public class PrintTheArrayInSimplestWay {

    public static void main(String[] args) {
        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = { 7.0, 9.0, 5.0, 1.0, 3.0 };
        System.out.println(Arrays.toString(doubleArray));

        String[] strArray = new String[] { "John", "Mary", "Bob" };
        System.out.println(Arrays.toString(strArray));

        // If your array contains other arrays as elements
        String[][] deepArray = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };
        System.out.println(Arrays.toString(deepArray));
        System.out.println(Arrays.deepToString(deepArray));

        // Java 8 Lambda
        // #1
        System.out.println(Arrays.asList(strArray).stream().collect(Collectors.toList()));
        // #2
        System.out.println(Stream.of(strArray).collect(Collectors.toList()));
        // #3
        System.out.println(Arrays.stream(strArray).collect(Collectors.toList()));
    }
}