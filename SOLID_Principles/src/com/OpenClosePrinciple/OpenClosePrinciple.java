package com.OpenClosePrinciple;

interface Shape{
	public double area();
}

final class Circle implements Shape {
	
	private int radius;
	@Override
	public double area() {
		return Math.PI * radius*radius;
	}	
}

final class Rectangle implements Shape {

	private int side;
	@Override
	public double area() {
		return side*side;
	}
}
public class OpenClosePrinciple {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		System.out.println("Circle area: " + circle.area());

		Shape rectangle = new Rectangle();
		System.out.println("Rectangle area: " + rectangle.area());

		// We can add more shapes without modifying existing code
		// Just implement the Shape interface and add a new class
		

	}
}
