package lamda.api.minByAndMaxBy;

import java.util.function.BinaryOperator;

public class OpertaorMinByMaxByExample {

    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
        fruit = binaryOperator.apply(new Fruit("strawberry", 6000), new Fruit("watermelon", 10000));
        System.out.println(fruit.getName());

        binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
        fruit = binaryOperator.apply(new Fruit("strawberry", 6000), new Fruit("watermelon", 10000));
        System.out.println(fruit.getName());
    }
}
