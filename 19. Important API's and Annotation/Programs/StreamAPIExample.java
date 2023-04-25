import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        Stream<Integer> newStream = stream.filter(n -> n % 2 == 0).map(n -> n * 2).sorted();
        newStream.forEach(n -> System.out.println(n));

    }
}
