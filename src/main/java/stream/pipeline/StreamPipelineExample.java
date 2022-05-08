package stream.pipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {

    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("a", Member.MALE, 30),
                new Member("b", Member.FEMALE, 20),
                new Member("c", Member.MALE, 22),
                new Member("d", Member.FEMALE, 45)
        );

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.FEMALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println(ageAvg);
    }
}
