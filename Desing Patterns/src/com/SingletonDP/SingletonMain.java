package com.SingletonDP;

public class SingletonMain {
    public static void main(String[] args) {

        // Get the single instance of Singleton
        Singleton singletonInstance1 = Singleton.getInstance();
        singletonInstance1.showMessage();

        // Get the single instance of Singleton again
        Singleton singletonInstance2 = Singleton.getInstance();
        singletonInstance2.showMessage();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (singletonInstance1 == singletonInstance2));
    }
}
