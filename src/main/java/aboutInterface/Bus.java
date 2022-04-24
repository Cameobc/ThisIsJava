package aboutInterface;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println(" Bus Run ");
    }

    public void checkFare(){
        System.out.println(" 승차 요금을 체크합니다. ");
    }
}
