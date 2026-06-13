package com.Reduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Find Second Highest Element

public class FindSecondHigstElement {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(4,6,98,2,4,78,1,8));
		
		Optional<Integer> first = list.stream()
									.sorted((o1, o2) -> o2.compareTo(o1))
									.skip(1)
									.findFirst();
									
		first.ifPresent(System.out::println);
	}
}
