package stream.character;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 10),
                new Student("b", 20),
                new Student("c", 30)
        );

        double avg = list.stream()
                // 중간 처리(학생 객체를 점수로 매핑
                .mapToDouble(Student::getScore)
                // 최정 처리"(평균 점수)
                .average().getAsDouble();

        System.out.println("avg ::: "+ avg);
    }
}
