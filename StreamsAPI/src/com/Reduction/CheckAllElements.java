package com.Reduction;

import java.util.ArrayList;
import java.util.List;

			// How can you use streams to check if all elements in a list satisfy a given condition?

public class CheckAllElements {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(2,4,5,6,8));
		
		boolean allMatch = list.stream()
							    .allMatch(n -> n%2 == 0);
		
		System.out.println(allMatch);
		
		
	}
}
