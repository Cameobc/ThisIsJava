package operator;

public class CharOperationExample {

    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1; 66 + 1 로 int 타입이 되므로 char 타입에 대입불가
        // 강제 타입 변환을 해야 한다. (char)(c2 + 1);
        // java: incompatible types: possible lossy conversion from int to char
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
