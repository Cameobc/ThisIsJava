package javaApi.objectHashCode;

public class Key {
    /**
     * 객체 해시코드란 객체를 식별할 하나의 정수값을 말함
     * Object.hashCode() 는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 지님
     * 논리적 동등 비교 시 오버라이딩할 필요성이 있음
     *
     */
    // hashCode 메소드를 재정의하지 않음
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key){
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number){
                return true;
            }
        }
        return false;
    }

    //메소드 재정의 추가

    @Override
    public int hashCode() {
        return number;
    }
}
