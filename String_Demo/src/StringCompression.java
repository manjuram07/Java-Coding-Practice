import java.util.HashSet;
import java.util.Set;

public class StringCompression {

	public static void main(String[] args) {
		String s = "aaabbbccd";
		int count;

//		Set<Character> set = new HashSet<Character>();
//
//		for (int i = 0; i < s.length(); i++) {
//			count = 1;
//			if (!set.contains(s.charAt(i))) {
//				for (int j = i + 1; j < s.length(); j++) {
//					if (s.charAt(i) == s.charAt(j)) {
//						count++;
//					}
//				}
//				System.out.print(s.charAt(i));
//				System.out.print(count);
//				set.add(s.charAt(i));
//			}
//		}

		for (int i = 0; i < s.length(); i++) {
			// count = 1
			count = 1;
			// while i is less than s.length-1 and s.charAt(i) is equal to s.charAt(i+1)
			while (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
				// increment count
				count++;
				// increment i
				i++;
			}
			System.out.print(s.charAt(i));
			System.out.print(count);
		}
	}
}
