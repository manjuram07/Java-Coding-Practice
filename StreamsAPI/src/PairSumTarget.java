import java.util.List;
import java.util.stream.Collectors;

public class PairSumTarget {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		int target = 7;
		
		List<List<Integer>> collect = list.stream()
			.flatMap(i -> list.stream()
							.filter(j -> i<j && (i+j) == target)
							.map(j -> List.of(i,j))
			)
			.collect(Collectors.toList());
		
		System.out.println(collect);
		

	}

}
