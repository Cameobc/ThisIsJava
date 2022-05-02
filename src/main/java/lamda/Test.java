package lamda;

public class Test {
    public static void main(String[] args) {
        Object o = (Runnable)() -> {
            System.out.println("Tricky example");
        };
    }
}
