package classes;

public class Car {
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 35;
    int speed;
    int cc;

    // 생성자 오버로딩
    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //method
    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for(int i = 10; i<=50; i+=10){
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다. (시속 : "+ this.speed + "km/h)");
        }
    }
}
