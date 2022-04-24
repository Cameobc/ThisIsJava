package inheritance;

public class DriverExample {

    // 매개 변수의 다형성 구현
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);


    }
}
