import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {
		String s1 = "right";
		String res = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			res = res + s1.charAt(i);
		}
		System.out.println(s1.equals(res));
		
		// without using extra string

		int left = 0, right = s1.length() - 1;
		while (left < right) {
			if (s1.charAt(left) != s1.charAt(right)) {
				System.out.println("false");
				System.exit(0);
			}
			left++;
			right--;
		}
		System.out.println("true");
		
		
	}
}
