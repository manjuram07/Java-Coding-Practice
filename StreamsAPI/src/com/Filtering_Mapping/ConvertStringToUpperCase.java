package com.Filtering_Mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ConvertStringToUpperCase {

	public static void main(String[] args) {	
		
		List<String> list = new ArrayList<String>(List.of("Apple","Flipkart"," ","Microsoft","Amazon"));
		
		List<String> filteredList = list.stream()
								.filter(s1 -> !s1.equals(" "))
								//.map(s1 -> s1.toUpperCase())
								.map(String::toUpperCase)
								
								.collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		List<String> numbers = new ArrayList<String>(List.of("1","2","3","4","5","6","7","8","9","10"));
		IntStream mapToInt = numbers.stream().mapToInt(I -> Integer.valueOf(I));
		System.out.println(mapToInt.sum());
		numbers.stream().map(Integer::valueOf);
		//number.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
