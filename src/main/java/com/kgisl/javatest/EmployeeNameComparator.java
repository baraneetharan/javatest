package com.kgisl.javatest;

import java.util.Comparator;

/**
 * EmployeeNameComparator
 */
public class EmployeeNameComparator implements Comparator<Employee>{  
    public int compare(Employee e1,Employee e2){  
    return e1.name.compareTo(e2.name);  
    }  
}