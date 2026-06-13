
/*
 * 
 * StringBuffer : it is a mutable class it is a thread safe and synchronized
 * StringBuilder : it is a mutable class it is a not a thread safe and not synchronized
 * 
 * StringBuilder is more efficient than StringBuffer in single threaded environment. bcz it is not thread safe.
 */
public class StringBuffer_Demo {

	public static void main(String[] args) {
		
		String str = "manjuram";		
		str.concat("KH");		
		System.out.println(str);
		
		StringBuffer stringBuffer = new StringBuffer("manjuram");
		stringBuffer.append("KH");	
		System.out.println(stringBuffer.equals(str));
		System.out.println(stringBuffer);
		
		StringBuffer stringBuffer1 = new StringBuffer("manjuram");
		StringBuffer stringBuffer2 = new StringBuffer("manjuram");

		boolean equals = stringBuffer1.equals(stringBuffer2);

		System.out.println(equals); //false: because StringBuffer does not override equals() method, it uses Object class equals() method which compares references.
		System.out.println(stringBuffer1.compareTo(stringBuffer2) == 0);  //true: because compareTo() method compares the content of the StringBuffer objects and returns 0 if they are equal.
		
		StringBuilder stringBuilder1 = new StringBuilder("ram");
		StringBuilder stringBuilder2 = new StringBuilder("ram");

		boolean equals1 = stringBuilder1.equals(stringBuilder2);

		System.out.println(equals1);   //false: because StringBuilder does not override equals() method, it uses Object class equals() method which compares references.
		System.out.println(stringBuilder1.compareTo(stringBuilder2) == 0);  //true

	}	
}
