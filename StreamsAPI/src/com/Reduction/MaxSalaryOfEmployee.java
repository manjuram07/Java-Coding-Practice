package com.Reduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

			//How would you find the maximum salary of employees in a department using streams

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
public class MaxSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "CSE",150000));
		list1.add(new Employee(2, "ECE",60000));
		list1.add(new Employee(3, "CSE",25000));
		list1.add(new Employee(4, "CIVIL",40000));
		list1.add(new Employee(5, "CSE",352650));
		list1.add(new Employee(6, "MECH",60000));
		
		Employee employee = list1.stream()
								   .filter(s -> s.getDept().equals("CSE"))
								   .max((o1, o2) ->Integer.compare(o1.getSalary(), o2.getSalary()))
								   .get();
		
		System.out.println(employee.getSalary());	
	
	}
}


