package aboutInterface.defaultMethodInheritance;

public interface ChildInterface2 extends ParentInterface{

    //재정의
    @Override
    default void method2() {
        //ParentInterface.super.method2();
    }

    public void method3();
}
