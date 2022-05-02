package lamda.parameterAndReturnNotExist;

public class MyFunctionalInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface f1;

        f1 = () -> {
            String str = "method call1";
            System.out.println(str);
        };

        f1.method();

        f1 = () ->{
            System.out.println("method call2");
        };
        f1.method();

        // 실행문이 하나인 관계로 중괄호 생략 가능
        f1 = () -> System.out.println("method call3");
        
        f1.method();
    }
}
