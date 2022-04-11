package inheritance;

/**
 * B는 A와 동일한 패키지이므로 얼마든지 접근 가능
 */
public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
    }
}
