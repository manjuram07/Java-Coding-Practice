package com.Singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Instances are different. Singleton pattern is not working.");
        }
    }
}
