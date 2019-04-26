package com.kgisl.javatest;

public class Student {
    private int rollno;
    private String name;
 
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
 
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * @return the rollno
     */
    public int getRollno() {
        return rollno;
    }
 
    /**
     * @param rollno the rollno to set
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
 
    @Override
    public String toString() {
        return "rollno:" + rollno + " name:" + name;
    }
 }