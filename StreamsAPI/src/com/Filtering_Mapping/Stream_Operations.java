// Explain how to filter a list of employees based on their department and then map their salaries to a new list.
package com.Filtering_Mapping;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
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
	
}
public class Stream_Operations {

	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "CSE",150000));
		list1.add(new Employee(2, "ECE",60000));
		list1.add(new Employee(3, "MECH",25000));
		list1.add(new Employee(2, "CIVIL",40000));
		
		List<Integer> salary = list1.stream()
									.filter(e -> "CSE".equals(e.getDept()))
									.map(Employee::getSalary)
									.collect(Collectors.toList());
		
		salary.forEach(System.out::println);
	}

}
