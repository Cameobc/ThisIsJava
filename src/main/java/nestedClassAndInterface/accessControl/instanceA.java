package nestedClassAndInterface.accessControl;

// 바깥 필드와 메소드에서 사용 제한
public class instanceA {

    //인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    //인스턴스 메소드
    void method(){
        B var1 = new B();
        C var2 = new C();
    }

    //정적필드 초기화
    //static B field3 = new B();
    static C field4 = new C();

    //정적 메소드
    static void method2(){
        //B var1 = new B();
        C var2 = new C();
    }

    //인스턴스 멤버 클래스
    class B{}

    //정적 멤버 클래스
    static class C{}
}
