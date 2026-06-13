import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set_Demo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 1, 4, 5, 2, 6, 8, 7));

        set.forEach((i) -> System.out.println(i));

        set.stream()
                .filter((i) -> i == 4)
                .forEach(System.out::println);

        List<Integer> collect = set.stream()
                .filter((i) -> i == 4)
                .collect(Collectors.toList());

        System.out.println("value is : " + collect);

        Stream<Integer> map = set.stream()
                .map(i -> i = i * i);

        //System.out.println(map.collect(Collectors.toList()));

        System.out.println(map.collect(Collectors.toList()));

        set.stream().map(i -> i = i * i).forEach((i) -> System.out.print(i + " "));


    }

}
