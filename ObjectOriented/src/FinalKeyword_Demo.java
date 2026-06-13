
class Student{
	final String name = "";
	final int age = 0;
	
	//  can not make the constuctor as final bcz can't override
//	public final Student() {
//		this.name="ram";
//		this.age=20;
//	}
}
public class FinalKeyword_Demo {

	public static void main(String[] args) {
		
		String name = new Student().name;
		System.out.println(name);
		

	}
}
