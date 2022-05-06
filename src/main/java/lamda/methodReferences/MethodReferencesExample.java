package lamda.methodReferences;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

    public static void main(String[] args) {
        IntBinaryOperator operator;

        //static method
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1 : " + operator.applyAsInt(2, 5));

        operator = Calculator::staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(1, 5));

        // instance method
        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과1 : " + operator.applyAsInt(3, 5));

        operator = obj::instanceMethod;
        System.out.println("결과2 : " + operator.applyAsInt(4, 5));
    }
}
