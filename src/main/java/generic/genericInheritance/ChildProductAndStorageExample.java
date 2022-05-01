package generic.genericInheritance;

import classes.Television;

// 제네릭 사용 클래스
public class ChildProductAndStorageExample {

    public static void main(String[] args) {
        ChildProduct<Television, String, String> product = new ChildProduct<>();
        product.setKind(new Television());
        product.setCompany("Samsung");
        product.setModel("Smart Tv");

        Storage<Television> storage = new StorageImpl<Television>(100);
        storage.add(new Television(), 0);
        Television tv = storage.get(0);
    }
}
