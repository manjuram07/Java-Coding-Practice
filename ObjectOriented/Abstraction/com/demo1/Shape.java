package com.demo1;

public abstract class Shape {
	
	final String color;
	
	
	// these are abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have the constructor
	public Shape(String color) {
		this.color = color;
	}
	
	// abstract class can have the concrete methods
	public String getColor() {
		return color;
	}
	
}
