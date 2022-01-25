import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMapBasics ob = new HashMapBasics();

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        //map.put(null, null);

        //iterate using forEach loop
        map.forEach(
                (key,value) -> {
                    if (key % 2 == 0 || value % 2 == 0) {
                        System.out.println(key + " -> " + value);
                    }
                }
        );

        //using stream API
        map.keySet().stream().forEach(
                key -> {
                    if (key % 2 != 0)
                        System.out.println("*" + key + "*");
                }
        );

        map.entrySet().stream().forEach(
                (entry) -> {
                    if (entry.getValue() == 1)
                        System.out.println(entry.getKey() + "***" + entry.getValue());
                }
        );


        //using entry set
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " <- " + entry.getValue());
        }






    }
}
