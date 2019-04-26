package com.kgisl.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArraysClassMethods
 */
public class ArraysClassMethods {
    public static Employee emp3[] ={new Employee(3, "name3")};
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

        // binarySearch
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr);
        int intKey = 22;
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

        Employee emp[] = { new Employee(1, "name1"), new Employee(2, "name2") };

        for (Employee var : emp) {
            if (var.name.equals("name2")) {
                System.out.println(var.id + " " + var.name);
            }
        }

        Arrays.stream(emp).filter(x -> x.name.equals("name2")).forEach(System.out::println);
        
        Employee emp1[] = new Employee[3];
        
        Arrays.fill(emp1, new Employee());
        System.out.println(Arrays.toString(emp1)); 

        Employee emp2[] =Arrays.copyOf(emp, 1); 
        System.out.println(Arrays.toString(emp2)); 

        printArray(emp3);
    }
    public static void printArray(Employee... arr){        
            System.out.println(Arrays.toString(arr));
    }

}