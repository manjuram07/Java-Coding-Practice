import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMap_Demo {

    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        map.put(5, 'A');
        map.put(2, 'B');
        map.put(6, 'C');

        map.put(15, 'D');
        map.put(null, 'Z');
        map.put(23, 'E');
        map.put(16, 'F');
        map.put(null, 'Y');

        System.out.println(map);



        HashMap hashMap = new HashMap();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        Iterator<Integer> itr = hashMap.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
            if(key.equals(2)){
                hashMap.put(4, "Four"); // Modifying the HashMap during iteration
            }
        }
    }
}


