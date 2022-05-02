package lamda.localVariable;

public class UsingLocalVariable {
    // arg 는 final 특성을 가짐
    void method(int arg){
        // localVar 는 final 특성을 가짐
        int localVar = 40;

        //arg = 31; // final 특성으로 인해 수정 불가
        //localVar = 31; // final 특성으로 인해 수정 불가

        // lambda
        MyFunctionalInterface fi = () -> {
            // local variable read
            System.out.println("arg : " + arg);
            System.out.println("localVar = " + localVar);
        };
        fi.method();
    }
}
