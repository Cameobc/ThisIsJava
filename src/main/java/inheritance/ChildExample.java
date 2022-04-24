package inheritance;

public class ChildExample {

    private Parent parent;

    public static void main(String[] args) {
       /* Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2(); // 오버라이드 된 메서드가 호출된다.
        // 자식에게만 정의된 메서드는 부모가 호출할 수 없다.*/

        Parent parent = new Child(); // 자동 타입 변환
        parent.filed1 = "data1";
        parent.method2();
        parent.method1();

       /* parent.filed2 = "data2"; //사용불가
        parent.method3();   //사용불가*/

        Child child = (Child) parent; // 강제 타입 변환
        child.field2 = "YYY";
        child.method3();
    }
}
