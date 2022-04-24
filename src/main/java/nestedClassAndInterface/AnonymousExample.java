package nestedClassAndInterface;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        //익명 객체 필드 사용
        anonymous.field.wake();

        //익명 객체 로컬 변수 사용
        anonymous.method1();

        //익명 객체 매개값 사용
        anonymous.method2(
                new Person(){
                    void study(){
                        System.out.println("공부합니다.");
                    }
                    @Override
                    void wake(){
                        System.out.println("8시에 일어납니다.");
                        study();
                    }
                }
        );
    }
}
