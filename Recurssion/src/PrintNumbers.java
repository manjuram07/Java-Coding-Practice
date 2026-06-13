
public class PrintNumbers {

	public static void main(String[] args) {
		
		print(1);

	}

	private static void print(int i) {
				
		if (i > 10) {
			return;
		}
		print(i + 1);	// Recursive call to print the next number
		System.out.print(i + " ");
		
	}

}
