package generic.genericMethod;

import generic.no01.Box2;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box2<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();

        Box2<String> box2 = Util.boxing("홍길동");
        String intValue2 = box2.get();
    }
}
