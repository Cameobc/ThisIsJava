package stream.character;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "a", "b", "c", "d", "e"
        );

        // 순차처리
        list.stream().forEach(ParalleExample::print);

        System.out.println();

        // 병렬처리
        Stream<String> stringStream = list.parallelStream();
        stringStream.forEach(ParalleExample::print);

        System.out.println();
        list.parallelStream().forEach(ParalleExample::print);
    }

    public static void print(String str){
        System.out.println(str+" : "+Thread.currentThread().getName());
    }
}
