import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Create_Streams {

	public static void main(String[] args) {
		
		//Creating an empty Stream
		Stream<Integer> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
		// Write code to create a stream from a list
		List<Integer> list = Arrays.asList(5,8,2,4,1,7,6,9,3);		
		Stream<Integer> stream =  list.stream();		
		stream.forEach((i) -> System.out.print(i+" "));
		
		System.out.println();
		
		//Write code to create a stream from a set
		//List<Integer> list1 = new ArrayList<>(List.of(1,2,3,5,1,5,7,8,9));
		
		Set<Integer> set = new HashSet<Integer>(Set.of(5,2,7,8,3));
		Stream<Integer> setStream = set.stream();
		setStream.forEach((i) -> System.out.print(i+" "));
		
		Optional<Integer> max = set.stream().max((o1, o2) -> o1.compareTo(o2));
		System.out.println("max: "+ max.get());
		
		System.out.println();

		// Write code to create a stream from a array
		int[] array = {1,2,4,6,4,3,6};
		IntStream arrStream = Arrays.stream(array);
		arrStream.forEach((i) -> System.out.print(i+" "));
		
		
		
		
	}
}
