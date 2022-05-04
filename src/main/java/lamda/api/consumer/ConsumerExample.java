package lamda.api.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("Java");

        BiConsumer<String, String> biConsumer = (t, v) -> System.out.println(t + v);
        biConsumer.accept("java", "8");

        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (s, v) -> System.out.println(s + v);
        objIntConsumer.accept("java", 8);

    }
}
