package com.kgisl.javatest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * EmployeeStream
 */
public class EmployeeStream {

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "name1", "HR", 15000f);
        Employee1 emp2 = new Employee1(2, "name2", "HR", 35000f);
        Employee1 emp3 = new Employee1(3, "name3", "Dev", 35000f);
        Employee1 emp4 = new Employee1(4, "name4", "Test", 10000f);
        Employee1 emp5 = new Employee1(5, "name5", "HR", 5000f);
        Employee1 emp6 = new Employee1(6, "name6", "HR", 7000f);

        List<Employee1> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);

        // Total salary of all employees
        double totalSalary = employees.stream().mapToDouble(Employee1::getSalary).sum();
        System.out.println(totalSalary);

        // Total salary for each dept
        Map<String, Double> eachDepartmentSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee1::getDept, Collectors.summingDouble(Employee1::getSalary)));
        eachDepartmentSalary.entrySet().forEach(System.out::println);

        // Which department getting highest salary
        employees.stream().max(Comparator.comparing(Employee1::getSalary))
                .ifPresent(p -> System.out.println("Employee getting highest salary: " + p));

        // Who is getting lowest salary
        employees.stream().min(Comparator.comparing(Employee1::getSalary))
                .ifPresent(p -> System.out.println("Employee getting lowest salary: " + p));

        // Who are all getting same salary
        employees.stream().collect(Collectors.groupingBy(Employee1::getSalary)).values().stream()
                .filter(employeeWithSameSalary -> employeeWithSameSalary.size() > 1)
                .forEach(employeeWithSameSalary -> System.out.println("Employees with same salary: " + employeeWithSameSalary));
    }
}