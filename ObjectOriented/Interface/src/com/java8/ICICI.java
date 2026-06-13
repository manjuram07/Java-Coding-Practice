package com.java8;

/**
 * ICICI Bank implementation of RBI interface
 * Shows default method inheritance (not overriding default methods)
 */
public class ICICI implements RBI {
    @Override
    public void display() {
        System.out.println("ICICI Bank");
    }

    // Not overriding the default interest() method - will use interface's default implementation
}
