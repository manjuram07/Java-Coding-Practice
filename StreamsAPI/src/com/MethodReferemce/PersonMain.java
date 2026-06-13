package com.MethodReferemce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
	private boolean active;

	public Person(String name, boolean active) {
		super();
		this.name = name;
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}
}

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("John", true);
		List<Person> people = new ArrayList();
		people.add(person);

		// Using method references in stream pipeline
		List<String> activeNames = people.stream().filter(Person::isActive) // calls isActive() on each Person
				.map(Person::getName) // calls getName() on each Person
				.sorted(String::compareToIgnoreCase) // compares strings
				.collect(Collectors.toList());

		activeNames.forEach(System.out::println);

	}

}
