package nestedClassAndInterface;

// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter2 {
    String field  = "Outter-field";

    void mehtod(){
        System.out.println("outter-mehtod");
    }

    class Nested{
        String field = "Nested-field";
        void method(){
            System.out.println("Nemsted-method");
        }

        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println(Outter2.this.field);
            Outter2.this.mehtod();
        }
    }
}
