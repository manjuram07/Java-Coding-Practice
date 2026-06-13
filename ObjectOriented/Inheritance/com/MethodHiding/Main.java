package com.MethodHiding;

class Parent {
    public static void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Display method in Child class");
    }
}


public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Output: Display method in Parent class

        Child child = new Child();
        child.display(); // Output: Display method in Child class

        Parent parentRefChild = new Child();
        parentRefChild.display(); // Output: Display method in Parent class (method hiding)
    }
}