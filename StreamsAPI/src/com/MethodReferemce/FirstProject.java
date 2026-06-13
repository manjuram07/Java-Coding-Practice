package com.MethodReferemce;

import java.util.List;

@FunctionalInterface
interface MyInterface {
	int add(int a, int b);
}

public class FirstProject {

	public static void main(String[] args) {
		
		// concret implementation of the interface
		MyInterface myInterface = (int a, int b) -> {
			return a*b;
		};
		System.out.println(myInterface.add(5, 10)); // Output: 50
		
		// using method reference
		List<Double> list = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
		list.stream()
			.forEach(FirstProject :: printList);
	}

	public static void printList(Double list) {
		System.out.println(list);
	}

}
