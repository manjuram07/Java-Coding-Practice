import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByFirstCharacter {

    public static void main(String[] args) {

        List<String> names = List.of("apple", "banana", "bat");

        Map<Character, List<String>> freq =  names.stream()
                                                    .collect(Collectors
                                                                        .groupingBy(name -> name.charAt(0)));

        System.out.println(freq);


    }
}
