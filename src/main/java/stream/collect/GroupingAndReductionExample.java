package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

    public static void main(String[] args) {
        List<Student> totlaList = Arrays.asList(
                new Student("a", 10, Student.Sex.FEMALE),
                new Student("b", 8, Student.Sex.MALE),
                new Student("c", 7, Student.Sex.FEMALE),
                new Student("d", 5, Student.Sex.MALE)
        );

        // 성별로 평군 점수를 저장하는 Map 얻기
        Map<Student.Sex, Double> mapBySex = totlaList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.averagingDouble(Student::getScore)
                        )
                );

        System.out.println(" 남학생 평균 점수 ::: " + mapBySex.get(Student.Sex.MALE));
        System.out.println(" 여학생 평균 점수 ::: " + mapBySex.get(Student.Sex.FEMALE));

        // 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
        Map<Student.Sex, String> mapByName = totlaList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.joining(",")
                                )
                        )
                );

        System.out.println(" 남학생 전체 이름 ::: "+mapByName.get(Student.Sex.MALE));
        System.out.println(" 여학생 전체 이름 ::: "+ mapByName.get(Student.Sex.FEMALE));
    }
}
