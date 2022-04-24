package inheritance;

public class ChildExample {

    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2(); // 오버라이드 된 메서드가 호출된다.
        // 자식에게만 정의된 메서드는 부모가 호출할 수 없다.
    }
}
