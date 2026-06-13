package com.SingleResponsibilityPrinciple;

class User{
	
	private int id;
	private String name;
	private String dept;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}

class UserService {
	    public void createUser(User user) {
	        // Responsible for creating user
	    }
	}

class UserRepository {
	    public void saveUser(User user) {
	        // Responsible for to save a user 
	}
}

public class SingleResponsibilityPrinciple {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("manju");
		user.setDept("IT");

		UserService userService = new UserService();
		userService.createUser(user);

		UserRepository userRepository = new UserRepository();
		userRepository.saveUser(user);

	}

}
