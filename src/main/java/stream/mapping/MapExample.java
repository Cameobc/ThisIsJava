package stream.mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("a", 10),
                new Student("b", 20),
                new Student("b", 30)
        );

        studentList.stream().mapToInt(Student::getScore)
                .forEach(s -> System.out.println(s));
    }
}
