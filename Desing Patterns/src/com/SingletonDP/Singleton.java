package com.SingletonDP;

public class Singleton {

    // volatile keyword ensures that multiple threads handle the instance variable correctly when it is being initialized to the Singleton instance
    private static Singleton instance;

    // private constructor to prevent instantiation
    private Singleton() {
        // private constructor to prevent instantiation
    }

    // public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}
