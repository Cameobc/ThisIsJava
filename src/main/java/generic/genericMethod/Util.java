package generic.genericMethod;

import generic.no01.Box2;

public class Util {
    public static <T> Box2<T> boxing(T t) {
        Box2<T> box = new Box2<T>();
        box.set(t);
        return box;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
