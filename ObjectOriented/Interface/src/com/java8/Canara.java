package com.java8;

/**
 * Canara Bank implementation of RBI interface
 * Shows how to implement interface methods and optionally override default methods
 */
public class Canara implements RBI {
    @Override
    public void display() {
        System.out.println("Canara Bank");
    }

    // OPTIONAL: Override the default method to provide custom implementation
    @Override
    public void interest() {
        System.out.println("Canara Bank Special Interest Rate: 6.5%");
    }
}
