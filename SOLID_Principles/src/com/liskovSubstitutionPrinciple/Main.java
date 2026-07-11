package com.liskovSubstitutionPrinciple;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}


public class Main {

    public static void main(String[] args) {

        /*
        Shape[] shapes = {
                            new Rectangle(5,4),
                            new Square(5)
                         };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
         */

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(5);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}