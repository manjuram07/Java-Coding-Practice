import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {

    public static void main(String[] args) {

        /*
                time: O(n)
                space: O(n)
         */
        String msg = "madam";
//        boolean flag = false;
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(char c : msg.toCharArray()){
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//
//        for (char c : msg.toCharArray()){
//            if (map.get(c) == 1){
//                System.out.println(c);
//                flag = true;
//                break;
//            }
//        }
//
//        if (!flag){
//            System.out.println("NOT FOUND");
//        }

        int[] freq = new int[256];

        for (char c : msg.toCharArray()) {
            freq[c]++;
        }

        for (char c : msg.toCharArray()){
            if (freq[c] == 1){
                System.out.println(c);
                return;
            }
        }

        System.out.println("NOT FOUND");


    }
}
