package com.Grouping_Partition;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// How can you partition a list of numbers into two groups: even and odd numbers?"
public class EvenAndOdd {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Map<Boolean, List<Integer>> collect = list1.stream()
															.collect(Collectors
															.partitioningBy(n -> n%2 == 0));
		
//		System.out.println(list1.stream().collect(Collectors.groupingBy(n -> n%2 == 0)));
		
		List<Integer> even = collect.get(true);
		List<Integer> odd = collect.get(false);
		
		System.out.println(even);
		System.out.println(odd);
		
	}
}
