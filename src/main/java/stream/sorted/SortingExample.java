package stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {
        //숫자 요소
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream.sorted().forEach(s -> System.out.print( s + ", "));
        System.out.println();

        //객체 요소
        List<Student> list = Arrays.asList(
                new Student("c", 30),
                new Student("a", 10),
                new Student("b", 20)
        );

        list.stream().sorted().forEach(s -> System.out.println(s.getScore()));
        System.out.println();

        list.stream().sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));
    }
}
