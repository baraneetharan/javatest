package com.kgisl.javatest;

import java.util.Comparator;

/**
 * EmployeeIdComparator
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.salary == e2.salary)
            return 0;
        else if (e1.salary > e2.salary)
            return 1;
        else
            return -1;
    }
}