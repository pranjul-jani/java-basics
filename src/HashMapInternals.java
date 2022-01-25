import java.util.HashMap;
import java.util.Map;

public class HashMapInternals {

    // trying to use debug to understand internals of HashMap

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // this two strings will have same hashcode
        String collision1 = "FB";
        String collision2 = "Ea";

        System.out.println(collision1.hashCode());
        System.out.println(collision2.hashCode());

        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put(null, 5);
        map.put(collision1, 99);
        map.put("ddd", 44);
        map.put(collision2, 100);

    }
}
