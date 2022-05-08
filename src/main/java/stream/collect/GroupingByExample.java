package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> totlaList = Arrays.asList(
                new Student("a", 10, Student.Sex.FEMALE, Student.City.Seoul),
                new Student("b", 8, Student.Sex.MALE, Student.City.Busan),
                new Student("c", 7, Student.Sex.FEMALE, Student.City.Seoul),
                new Student("d", 5, Student.Sex.MALE, Student.City.Busan)
        );

        Map<Student.Sex, List<Student>> mapBySex = totlaList.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        System.out.println("남학생");
        mapBySex.get(Student.Sex.MALE).stream()
                        .forEach(s -> System.out.println(s.getName()));

        System.out.println("여학생");
        mapBySex.get(Student.Sex.FEMALE).stream()
                        .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<Student.City, List<Student>> mapByCity = totlaList.stream()
                .collect(Collectors.groupingBy(Student::getCity));

        System.out.println("서울");
        mapByCity.get(Student.City.Seoul).stream()
                        .forEach(s -> System.out.println(s.getName()));

        System.out.println("부산");
        mapByCity.get(Student.City.Busan).stream()
                .forEach(s -> System.out.println(s.getName()));


    }
}
