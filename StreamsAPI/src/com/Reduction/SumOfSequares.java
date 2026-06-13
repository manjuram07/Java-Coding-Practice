package com.Reduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Implement a method to find the sum of the squares of all integers in a list using streams.

public class SumOfSequares {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		 int sum = list.stream()
				 	   .mapToInt(i -> i*i)
				 	   .sum();
		 
		 System.out.println(sum); // 55
		 
		 Integer reduce = list.stream()
				 		       .reduce(1, (a,b) -> a*b);
				 		      
		  System.out.println(reduce); // 15
		 
		 
		 
		 
	}
}
