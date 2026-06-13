package com.InterfaceSegerationPrinciple;

/*
 * The Interface Segregation Principle states that clients should not be forced to depend on interfaces they do not use.
 * In this example, we have separate interfaces for different functionalities (EnginePowered, Flyable, Sailable) and classes that implement only the interfaces relevant to their functionality.
 */
interface EnginePowered {
	void startEngine();
}

interface Flyable {
	void fly();
}

interface Sailable {
	void sail();
}

class Car implements EnginePowered {
	public void startEngine() {
		System.out.println("Car engine started.");
	}
}

class Airplane implements EnginePowered, Flyable {
	public void startEngine() {
		System.out.println("Airplane engine started.");
	}

	public void fly() {
		System.out.println("Airplane is flying.");
	}
}

class Boat implements EnginePowered, Sailable {
	public void startEngine() {
		System.out.println("Boat engine started.");
	}

	public void sail() {
		System.out.println("Boat is sailing.");
	}
}

public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.startEngine();
	}

}
