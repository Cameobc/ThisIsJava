package generic.no01;

public class BoxExample {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동");                   // String -> Object  자동타입변환
        String name = (String) box.getObject();   // Object -> String 강제 타입변환

        box.setObject(new Apple());             // Apple -> Object  자동타입변환
        Apple apple = (Apple) box.getObject();  // Object -> Apple 강제 타입변환



        // 타입 변환이 발생하지 않는다.
        Box2 box1 = new Box2();
        box1.set("홍길동");
        String name1 = (String) box1.get();

        box1.set(new Apple());
        Apple apple1 = (Apple) box1.get();
    }
}
