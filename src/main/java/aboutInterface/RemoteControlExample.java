package aboutInterface;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(false);
        //정적 메소드는 바로 호출 가능!
        RemoteControl.changeBattery();
        // 익명 구현 객체
        RemoteControl rcA = new RemoteControl() {
            public void turnOn() {

            }
            public void turnOff() {

            }
            public void setVolume(int volume) {

            }
        };
    }
}
