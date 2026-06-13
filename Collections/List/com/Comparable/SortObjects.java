package com.Comparable;

import java.util.ArrayList;
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


}

public class SortObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee(102, "manju", 55000);
        Employee e2 = new Employee(101, "krishna", 155000);
        Employee e3 = new Employee(103, "ram", 105000);

        List<Employee> list = new ArrayList<>(List.of(e1, e2, e3));

//        Stream<Employee> sorted = list.stream().sorted((o1, o2) -> o1.getId().compareTo(o2.getId()));
//        sorted.forEach(i -> System.out.println(STR."\{i.getId()}  \{i.getName()} \{i.getSalary()}"));
        System.out.println(STR."-----------------------------");
        Stream<Employee> sortedByName = list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
        sortedByName.forEach(i -> {
            System.out.println(STR."\{i.getId()}  \{i.getName()} \{i.getSalary()}");
        });
    }

}
