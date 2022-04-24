package aboutInterface.defaultMethod;

public interface MyInterface {

    public void method1();

    public default void method2(){
        System.out.println("MyInterFace - method2()");
    }
}
