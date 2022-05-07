package stream.character;


import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("a", 90),
                new Student("b", 92)
        );

        students.stream().forEach( s ->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "   " + score);
        });
    }
}
