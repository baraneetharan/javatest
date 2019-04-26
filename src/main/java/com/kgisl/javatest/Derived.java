package com.kgisl.javatest;

class Derived extends Base 
{ 
    // constructor 3 
    Derived() 
    { 
        System.out.println("No-argument constructor " +  
                           "of derived"); 
    } 
  
    // parameterized constructor 4 
    Derived(String name) 
    { 
        // invokes base class constructor 2 
        super(name); 
        System.out.println("Calling parameterized " +  
                           "constructor of derived"); 
    }
} 