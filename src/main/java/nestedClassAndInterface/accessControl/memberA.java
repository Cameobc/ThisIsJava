package nestedClassAndInterface.accessControl;

// 멤버 클래스에서 사용 제한
public class memberA {
    int field1;

    void method1(){}

    static int field2;
    static void method2(){}

    class B{
        // 모든 필드와 메소드 접근 가능
        void method(){
            field1 = 10;
            method1();

            field2 = 20;
            method2();
        }
    }

    static class C{
        // 인스턴스 필드와 메소드 접근 불가
        void method(){
            //field1 = 10;
            //method1();

            field2 = 20;
            method2();
        }
    }
}
