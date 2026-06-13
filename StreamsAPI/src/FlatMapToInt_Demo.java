import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapToInt_Demo {

	public static void main(String[] args) {
		
		String[][] words = {{"Hi", "there"}, 
						     {"Java","streams"}};
		
		List<Integer> collect = Arrays.stream(words)
									.flatMap(arr -> Arrays.stream(arr)
															    .map(String :: length)
												)
									.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}

}
