package stream.character;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsStreamExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        // iterator
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        // stream
        list.stream().forEach(name ->{
            System.out.println(name);
        });
    }
}
