import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsExample {

    public static <binaryList> void main(String[] args) {

        JavaStreamsExample ob = new JavaStreamsExample();

        List<Integer> number = Arrays.asList(2,3,4,5,6);

        // map method demonstration

        // using anonymous function
        List<Integer> squares = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squares);

        //using separate function
        List<Integer> binaryList = number.stream()
                .map(x -> convertToBinary(x))
                .collect(Collectors.toList());
        System.out.println(binaryList);


        //using filter

        List<String> names = Arrays.asList("apple", "ball", "cat", "app");

        List<String> result = names.stream()
                .filter(s -> s.startsWith("app"))
                .collect(Collectors.toList());
        System.out.println(result);

    }

    private static Integer convertToBinary(int n) {
        if (n % 2 == 0) return 0;
        return 1;
    }
}
