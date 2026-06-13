package com.MethodReferemce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CodingQuestions {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Charlie", "Chalie", "David", "Eva");
		
		// 2. Find the Longest Name Using Method Reference
//		Optional<Integer> max = names.stream()
//										.map(len -> len.length())
//										.max((o1, o2) -> o1.compareTo(o2));
//										max.ifPresent(newName -> System.out.println("Longest Name Length: " + newName));
//

		Optional<Integer> max = names.stream()
										.map(name -> {
											return name.length();
										})
										.max(((o1, o2) -> {
											return o1.compareTo(o2);
										}));

		System.out.println(max);


		//3. Convert All Strings to Lowercase Using Method Reference
		names.stream().map(String :: toLowerCase).forEach(name -> System.out.print(name+" "));;
		
		
		// 4. Sort a List of Strings Ignoring Case Using Method Reference
		System.out.println("\nSorted Names Ignoring Case:");
		//names.stream().filter(s -> s.equalsIgnoreCase(s)).sorted().forEach(name -> System.out.print(name + " "));
		names.stream()
				.sorted(String :: compareToIgnoreCase)
				.forEach(System.out::println);
		
		
		// 5. Count Distinct Words (Case-Insensitive) in Sentences Using Method Reference
		List<String> sentences = Arrays.asList(
				    "Java Stream API provides a fluent interface for processing sequences of elements.",
				    "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
				    "In this exercise, you need to count the total number of words in all sentences.");
		
//		long count = sentences.stream().distinct().count();
//		System.out.println("Distinct Sentences Count: " + count);
		long count = sentences.stream()
							.flatMap(sentence -> Arrays.stream(sentence.split("\\W+")))
							.map(String::toLowerCase)
							.distinct()
							.count();

		System.out.println("Distinct Words Count (Case-Insensitive): " + count);

		// 6. Find the First Word in a Sentence Using Method Reference
		String firstWord = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split("\\W+")))
				.findFirst().orElse("No words found");
		
		String orElse = sentences.stream().findFirst().orElse("No sentences found");

		System.out.println("First Word in Sentences: " + firstWord+" "+orElse);

	}
}
