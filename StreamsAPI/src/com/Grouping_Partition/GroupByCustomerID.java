package com.Grouping_Partition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of orders, how would you group them by customer ID using streams?

class Order{
	private Integer id;
	private String name;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", address=" + address + "]";
	}
	
	
}
public class GroupByCustomerID {

	public static void main(String[] args) {
		
		List<Order> list = new ArrayList<>();
		list.add(new Order(1, "Mob", "Dava"));
		list.add(new Order(2, "airbods", "Mys"));
		list.add(new Order(3, "mouse", "Blore"));
		list.add(new Order(1, "laptop", "Mang"));
		
		Map<Integer, List<Order>> collect = list.stream().collect(Collectors.groupingBy(Order :: getId));
		
		collect.forEach((custId, orderList) -> {
			System.out.println(custId);
			orderList.forEach(order -> System.out.println(order));
		});
	}
}
