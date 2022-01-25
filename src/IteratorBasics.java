import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBasics {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);


        //iterator has remove method while normal for loop cannot do that
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("new-list x 1 -- " + list);


        // short of the above step
        list.removeIf(curr -> curr % 2 != 0);
        System.out.println("new-list x 2 -- " + list);

        list.add(null);
        list.forEach(x -> {
                    if (x == null)
                        System.out.println("list contains null elements");
                }
        );

    }

}
