package com.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee {
    private String name;
    private Integer id;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }

}

public class SortObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee(102, "manju", 55000);
        Employee e2 = new Employee(101, "krishna", 155000);
        Employee e3 = new Employee(103, "ram", 105000);

        List<Employee> list = new ArrayList<>(List.of(e1, e2, e3));

        list.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                int len1 = o1.getName().length();
                int len2 = o2.getName().length();

                if (len1 > len2) {
                    return -1;
                } else if (len1 < len2) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
        list.forEach((i) -> System.out.println(i));

        Stream<Employee> sorted = list.stream().sorted(Comparator.comparing(Employee::getSalary));

        //list.sort(Comparator.comparing(Employee::getSalary));

        //sorted.forEach(System.out::println);

        //list.sort(Comparator.comparing(Employee::getName));
    }
}
