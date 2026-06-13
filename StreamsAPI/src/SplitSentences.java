import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitSentences {

	public static void main(String[] args) {

		List<String> list = List.of("Java is fun", "Stream API", "java 8 features");
		
		List<String> list2 = list.stream()
			//.flatMap(s -> Arrays.stream(s.split(" "))).toList();
			.flatMap(s -> Arrays
								.stream(s.split(" ")))
			
			.collect(Collectors.toList());
		
		System.out.println(list2);
		
	}

}
