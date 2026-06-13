package com.Singleton;


public class Singleton {

    // The instance of the singleton class is stored in a private static variable
    private static Singleton instance;

    // The constructor is private to prevent instantiation from outside the class
    private Singleton() {

    }

    // This method provides a global point of access to the singleton instance
    /*
        * If the instance does not exist, it creates it. Otherwise, it returns the existing instance.
        * Thread safety is not guaranteed in this implementation.
        * In a multi-threaded environment, multiple threads could create multiple instances of the singleton class.
        * To make it thread-safe, you can use synchronization or other techniques to ensure that only one instance is created.
        * For example, you can use the synchronized keyword to make the getInstance() method thread-safe, which is a thread-safe way to implement the singleton pattern.
     */
    public static synchronized Singleton getInstance() {

        // If the instance does not exist, create it. Otherwise, return the existing instance.
        if (instance == null){
            instance = new Singleton();
        }

        // Return the singleton instance
        return instance;
    }
}
