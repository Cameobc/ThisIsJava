package classes;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();
        //Car myCar = new Car("black", 3000);

        System.out.println("제작회사 = " + myCar.company);
        System.out.println("모델명" + myCar.model);
        System.out.println("색상 = " + myCar.color);
        System.out.println("최고속도 = " + myCar.maxSpeed);
        System.out.println("현재속도 = " + myCar.speed);

        myCar.speed = 65;


        Car car2 = new Car("자가용");
        System.out.println("car2.company = " + car2.company);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.maxSpeed = " + car2.maxSpeed);

        Car car3 = new Car("자가용", "red");
        System.out.println("car3.company = " + car3.company);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.maxSpeed = " + car3.maxSpeed);

        Car car4 = new Car("자가용", "BLACK", 200);
        System.out.println("car4.company = " + car4.company);
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.maxSpeed = " + car4.maxSpeed);

        Car myCar1 = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar1.run();
        yourCar.run();
    }
}
