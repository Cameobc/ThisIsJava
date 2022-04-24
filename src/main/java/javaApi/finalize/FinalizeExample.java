package javaApi.finalize;

public class FinalizeExample {
    
    // finalize() 메소드 실행 확인

    public static void main(String[] args) {
        Counter counter = null;
        for(int i = 0; i<=50; i++){
            counter = new Counter(i);
            counter = null; //객체를 쓰레기로 만듦
            System.gc(); //쓰레기 수집기 실행 요청
            // -> 이제 사용 불가
        }
    }
}
