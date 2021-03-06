package stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 92),
                new Student("c", 95),
                new Student("b", 99)
        );

        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = list.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a + b)
                .get();

        int sum3 = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
    }
}
