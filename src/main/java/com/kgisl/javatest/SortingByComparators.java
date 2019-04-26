package com.kgisl.javatest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * SortingByComparators
 */
public class SortingByComparators {
    public static void main(String[] args) {
        Employee emp[] = { new Employee(1, "Sachin",15000f), new Employee(2, "Rahul",13000f) };
        List<Employee> employees = Arrays.asList(emp);
        employees.forEach(System.out::println);
        System.out.println("******* EmployeeIdComparator *******");
        Collections.sort(employees, new EmployeeIdComparator());
        employees.forEach(System.out::println);
        System.out.println("******* EmployeeNameComparator *******");
        Collections.sort(employees, new EmployeeNameComparator());
        employees.forEach(System.out::println);
        System.out.println("******* EmployeeSalaryComparator *******");
        Collections.sort(employees, new EmployeeSalaryComparator());
        employees.forEach(System.out::println);
    }
}