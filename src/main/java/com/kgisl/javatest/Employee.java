package com.kgisl.javatest;

/**
 * Employee
 */
public class Employee {

    public int id;
    public String name;
    public String dept;
    public float salary;
    
    Employee(){}

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee(int id, String name,float salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}