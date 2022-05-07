package stream.kind;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {

    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(s -> System.out.print( s + ", "));

        System.out.println();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Stream<Integer> intStream = Arrays.stream(intArray);
        intStream.forEach(s -> System.out.println(s));
    }
}
