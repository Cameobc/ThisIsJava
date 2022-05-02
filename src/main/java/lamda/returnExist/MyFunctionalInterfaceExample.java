package lamda.returnExist;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface f1;
        f1 = ( x, y )->{
            int result = x+y;
            return result;
        };
        System.out.println(f1.mehtod(2, 5));

        f1 = ( x, y ) -> {
            return x + y ;};
        System.out.println(f1.mehtod(2, 3));

        f1 = (x, y) -> x+y;
        System.out.println(f1.mehtod(4, 3));

        f1 = (x, y) -> sum(x, y);
        System.out.println(f1.mehtod(3, 3));

    }

    private static int sum(int x, int y) {
        return x+y;
    }
}
