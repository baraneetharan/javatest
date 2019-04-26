package com.kgisl.javatest;

public class Child extends Parent {
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }
 
    public Child() {
        System.out.println("Child Constructor");
    }
    
 }