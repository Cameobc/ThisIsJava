package generic.boundedTypeParameter;

public class BoundedTypeParameterExample {

    public static void main(String[] args) {
        //String str = Util.compare("a", "b"); // String 은 Number 타입이 아님
        int result = Util.compare(10, 20);
        System.out.println(result);

        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);
    }
}
