package aboutInterface.defaultMethodInheritance;

public interface ChildInterface3 extends ParentInterface{

    // 추상 메소드로 재선언
    @Override
    public void method2();

    public void method3();
}
