package com.kgisl.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CreatelistfromcommaseparatedString
 */
public class CreateListFromCommaSeparatedString {
    public static void main(String[] args) {
        String commaSeparated = "item1 , item2 , item3";
        // String[] java.lang.String.split(String regex)
        // Splits this string
        String[] items = commaSeparated.split(",");
        // Print String Array
        System.out.println(Arrays.toString(items));
        // Convert Array to List
        List<String> items1 = new ArrayList<String>(Arrays.asList(items));
        System.out.println(items1);
        // <String> List<String> java.util.Arrays.asList(String... a)
        List<String> items2 = Arrays.asList(commaSeparated.split(","));
        System.out.println(items2);

        // The above code splits the string on a delimiter defined as:
        // zero or more whitespace, a literal comma,
        // zero or more whitespace which will place the words into the list
        // and collapse any whitespace between the words and commas
        List<String> items3 = Arrays.asList(commaSeparated.split("\\s*,\\s*"));
        System.out.println(items3);

        for (int i = 0; i < items3.size(); i++) {
            System.out.println(" -->" + items3.get(i));
        }
    }

}