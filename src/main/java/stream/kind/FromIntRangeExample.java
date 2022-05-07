package stream.kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {

    //정수 범위를 소스로 하는 스트림
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(s -> sum += s);
        System.out.println("sum ::: "+sum);
    }
}
