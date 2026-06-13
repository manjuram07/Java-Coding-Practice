package com.BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        User user = new User.Builder()
                .setName("Manjunath")
                .setAge(25)
                .setCity("Bangalore")
                .setJob("Java Developer")
                .setIsActive(true)
                .build();

        System.out.println("User Details:" +user.toString());

    }
}
