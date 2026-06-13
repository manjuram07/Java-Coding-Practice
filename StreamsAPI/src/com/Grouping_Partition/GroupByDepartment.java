package com.Grouping_Partition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// Given a list of employees, how would you group them by department using streams?

class Employee {
	private int id;
	private String dept;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String dept, int salary) {
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", salary=" + salary + "]";
	}

}

public class GroupByDepartment {

	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "CSE", 150000));
		list1.add(new Employee(2, "ECE", 60000));
		list1.add(new Employee(3, "CSE", 25000));
		list1.add(new Employee(4, "CIVIL", 40000));
		list1.add(new Employee(5, "CSE", 352650));
		list1.add(new Employee(6, "MECH", 60000));
		list1.add(new Employee(7, "ECE", 25000));

		Map<String, List<Employee>> collect = list1.stream().collect(Collectors.groupingBy(Employee::getDept));

		collect.forEach((dept, empList) -> {

			System.out.print(dept + " ");
			empList.forEach(emp -> System.out.print(emp));

			System.out.println();
		});

	}
}
