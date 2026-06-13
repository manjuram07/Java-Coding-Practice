import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenArraysOfArray {

	public static void main(String[] args) {

		Integer[][] arr = {{10,20},
			{30,40,50},
			{60}};
		
		Integer[] array = Arrays.stream(arr)					// Converts the 2D array into a Stream of arrays.
							     .flatMap(Stream :: of)			// Stream<Integer> → 10, 20, 30, 40, 50, 60
							     .toArray(Integer[] :: new); 	//  Integer[] array = [10, 20, 30, 40, 50, 60]
		
		System.out.println(Arrays.toString(array));
	}
}
