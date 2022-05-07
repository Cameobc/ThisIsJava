package stream.kind;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 10),
                new Student("b", 20),
                new Student("c", 30)
        );

        Stream<Student> stream = list.stream();
        stream.forEach( s -> System.out.println(s.getName()));
    }
}
