package com.Filtering_Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// How can you use streams to find the first non-empty string in a list

public class FindFirstEmptyString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("","Microsoft","Apple","Amazon","","Oracle"));
		
		Optional<String> first = list.stream()
									.filter(s -> ! s.isEmpty())
									.findFirst();
		
		first.ifPresent(System.out::print);
		

	}

}
