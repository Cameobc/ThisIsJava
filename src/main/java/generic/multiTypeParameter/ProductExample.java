package generic.multiTypeParameter;

import classes.Television;
import inheritance.Car;

public class ProductExample {

    public static void main(String[] args) {
        Product<Television, String> product1 = new Product<>();
        product1.setKind(new Television());
        product1.setModel("스마트 TV");
        Television tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
