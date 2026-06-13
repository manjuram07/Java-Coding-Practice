
public class PrimeNumber {

	public static void main(String[] args) {
		
		// print prime number 1 to 100

		
		for(int i=1; i<=20; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int num) {
		if(num <=1) {
			return false;
		}

		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}

		return true;
	}
}
