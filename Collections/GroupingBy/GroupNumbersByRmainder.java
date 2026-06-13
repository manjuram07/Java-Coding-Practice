import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByRmainder {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4,5,6,7,8,9);

        Map<Integer, List<Integer>> result = numbers.stream()
                                                    .collect(Collectors.groupingBy(number -> number % 3));

        System.out.println(result);


    }
}
