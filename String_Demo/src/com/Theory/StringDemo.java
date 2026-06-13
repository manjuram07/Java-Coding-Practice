package com.Theory;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {

	
		String s1 = new String("hello");
		String s2 = s1.intern();

		String s3 = "hello";
		
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s3 == s2) {
			System.out.println("s2 and s3 are same");
		} else {
			System.out.println("s2 and s3 are different");
		}
		
		
///		System.out.println(str.isBlank()+" "+str.length()+" "+ str);
//		System.out.println(str.isEmpty()+" "+str.length());
//		System.out.println(str.strip());
		
		List<String> list = List.of("Manju"," ", "Ram");
		
		Object[] array = list.toArray();
		System.out.println(array[0]);
		
		String[] array2 = list.toArray(String[] :: new);
		System.out.println(array2[0].charAt(0));
		
		List<String> list1 = Arrays.asList("Manju", " ", "Ram", null);
		
		System.out.println(list1.get(1).length());
		
		System.out.println(Optional.ofNullable(list1.get(0)).isEmpty());
		
		List<String> ans = list1.stream()
				.filter(i ->i != null)
								.filter(Predicate
											.not(String :: isBlank))
								.collect(Collectors.toList());
		
		System.out.println(ans);
		
		List<String> collect = list1.stream()
				.filter(i -> i != null)
					.filter(i-> !i.isEmpty())
					.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		String s12 = null ;
		
		System.out.println(s12.isBlank());
		System.out.println(s12.isEmpty());
		
		
		var name;
		
		
		
		

		
		
	}

}
