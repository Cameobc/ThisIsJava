package stream.collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

    public static void main(String[] args) {
        List<Student> totlaList = Arrays.asList(
                new Student("a", 10, Student.Sex.FEMALE),
                new Student("b", 8, Student.Sex.MALE),
                new Student("c", 7, Student.Sex.FEMALE),
                new Student("d", 5, Student.Sex.MALE)
        );

        MaleStudent student = totlaList.stream()
                .filter(e -> e.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        student.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
