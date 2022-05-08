package stream.parallelOperation;

import stream.collect.MaleStudent;
import stream.collect.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaleStudentExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 10, Student.Sex.FEMALE),
                new Student("b", 6, Student.Sex.MALE),
                new Student("c", 8, Student.Sex.FEMALE),
                new Student("d", 10, Student.Sex.MALE)
        );

        MaleStudent maleStudent = list.parallelStream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
