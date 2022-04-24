package javaApi.objectHashCode;

import java.util.HashMap;

public class KeyExample {
    // 다른 키로 인식
    // number 필드 값이 같더라고 hashCode() 메소드에서 리턴하는 해시코드가 다르기 때문에 다른 식별키로 인식하기 때문
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장한는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 "new Key(1)"  로 "홍길동" 저장
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)"로 "홍길동" 을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
