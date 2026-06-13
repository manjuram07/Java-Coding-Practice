
class Employee {
	private String name;
	private int eNo;
	private String dept;

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int eNo) {
		this.name = name;
		this.eNo = eNo;
	}

	public Employee(String name, int eNo, String dept) {
		this.name = name;
		this.eNo = eNo;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public int geteNo() {
		return eNo;
	}

	public String getDept() {
		return dept;
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {

		Employee e = new Employee("raam");
		Employee e1 = new Employee("raam", 123);
		Employee e2 = new Employee("raam", 149, "Spring dev");

		System.out.println(e.getName());
		System.out.println(e1.getName() + " " + e1.geteNo());
		System.out.println(e2.getName() + " " + e2.geteNo() + " " + e2.getDept());
	}

}
