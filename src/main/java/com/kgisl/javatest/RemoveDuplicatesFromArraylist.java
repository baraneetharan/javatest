package com.kgisl.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * RemoveDuplicatesFromArraylist
 */
public class RemoveDuplicatesFromArraylist {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("ABC");
        lst.add("ABC");
        lst.add("ABCD");
        lst.add("ABCD");
        lst.add("ABCE");

        System.out.println("Duplicates List " + lst);
        ArrayList<String> myArrayList = new ArrayList<String>(new HashSet<String>(lst));
        System.out.println(myArrayList);
        Object[] st = lst.toArray();
        for (Object s : st) {
            if (lst.indexOf(s) != lst.lastIndexOf(s)) {
                lst.remove(lst.lastIndexOf(s));
            }
        }

        System.out.println("Distinct List " + lst);

        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i).equals(lst.get(j))) {
                    lst.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicate:" + lst);

        List<String> distinctList = lst.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(distinctList.toArray()));

    }

}