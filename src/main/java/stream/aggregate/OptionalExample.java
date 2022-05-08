package stream.aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*// java.util.NoSuchElementException No value present
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();*/

        // 방법1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if(optional.isPresent()){
            System.out.println(" 방법1 평균 : " + optional.getAsDouble());
        }else{
            System.out.println( " 방법1 평균 : 0.0");
        }

        // 방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(" 방법2 평균 : " + avg);

        //방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(s -> System.out.println("방법 3의 평균 : "+s));
    }
}
