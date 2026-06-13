
public class MysterioousCase {

	public static void main(String[] args) {
		String s = "abcdedfagad";
		int len = s.length();
		int count;
		for(int i=0; i<len; i++) {
			count=1;
			for(int j=i+1; j<len; j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count<=1) {
				System.out.println(s.charAt(i) + " is repeated " + count + " times");
				System.exit(0);
			}
		}
		//System.out.println(maxCount);

	}

}
