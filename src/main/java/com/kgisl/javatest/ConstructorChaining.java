package com.kgisl.javatest;

/**
 * ConstructorChaining
 */
public class ConstructorChaining {

    public static void main(String args[]) 
    { 
        // calls parameterized constructor 4 
        Derived obj = new Derived("test"); 
  
        // Calls No-argument constructor 
        // Derived obj = new Derived(); 
    } 
}