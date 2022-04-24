package javaApi.finalize;

public class Counter {

    /**
     * 참조하지 않는 배열이나 객체는 Garbage Collector 가 힙 영역에서 자동적으로 소멸시킴
     * G.C. 는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize()) 를 실행시킴
     * 기본적으로 실행 내용이 없으며, 만약 객체가 소멸되기 전 마지막으로 사용했던 자원을 닫거나, 중요한 데이터를 저장하고 싶다면 이를 재정의한다.
     */
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no +"번 객체의 finalize()가 실행됨");
    }
}
