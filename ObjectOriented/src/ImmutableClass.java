



/*
 *  make class final
 *  make fields final
 *  get the properties using getterss
 */
final class Student1{
	private final String name;
	
	Student1(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
		
		Student1 s = new Student1("ram");
		System.out.println(s.getName());
		
	}

}
