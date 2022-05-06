package lamda.api.andThenAndCompose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = (m) -> m.getAddress();
        functionB = (m) -> m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(new Member("abc", "aaa", new Address("korea", "seoul")));

        System.out.println("city " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(new Member("bbb", "bca", new Address("korea", "busan")));
        System.out.println("city " + city);

    }
}
