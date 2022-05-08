package stream.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 10, Student.Sex.FEMALE),
                new Student("b", 6, Student.Sex.MALE),
                new Student("c", 8, Student.Sex.FEMALE),
                new Student("d", 10, Student.Sex.MALE)
        );

        //maleList
        List<Student> maleList = list.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream().forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //femaleHashSet
        Set<Student> femaleList = list.stream()
                .filter(s -> s.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
    }
}
