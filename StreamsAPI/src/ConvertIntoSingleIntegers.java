import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertIntoSingleIntegers {

	public static void main(String[] args) {
		
		// flatMap() :- method which flattens the resulting streams into single stream.
		
//		List<List<Integer>> list = List.of(List.of(1,2,3,4), List.of(9,15,20), List.of(6,7,8));
//		
//		Stream<Integer> flatMap = list.stream()
//										//.flatMap(List :: stream)
//										.flatMap(listItem -> listItem.stream());
//		
//		System.out.println(flatMap.toList());
		
		List<String> words = new ArrayList<>(List.of("java", "python", "spring", "reactjs"));

		System.out.println(words instanceof ArrayList<String>);

		String longest = words.stream()
		    .reduce((a, b) -> a.length() > b.length() ? a : b)
		    .orElse("none");

		System.out.println(longest);  // Output: spring

		

	}

}
