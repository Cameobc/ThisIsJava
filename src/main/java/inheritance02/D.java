package inheritance02;

import inheritance.A;
import inheritance.SupersonicAirplane;

/**
 * A와 다른 패키지이지만 자식 클래스이기 때문에 필드/생성자/메서드에 접근 가능
 * 단 new 연산자를 사용해서 생성자를 집접 호출할 수는 없고, 자식 생성자에서 super() 로 A 생성자를 호출할 수 있음
 */
public class D extends A {

    public D(){
        super();
        this.field = "value";
        this.method();
    }
}
