package com.records;

public record User(String name, int age) {
	
	public User(String name, int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Age must be above 18");
		}

		// compact constructor - no need to assign values to fields, as they are automatically assigned
		this.name = name;
		this.age = age;
	}
	
}
	