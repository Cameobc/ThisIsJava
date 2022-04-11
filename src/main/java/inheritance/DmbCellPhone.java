package inheritance;

public class DmbCellPhone extends CellPhone{

    int channel;

    public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    //methods

    void turnOnDmb(){
        System.out.println("채널 "+ channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel){
        System.out.println("switch channel :: "+ channel);
    }

    void turnOffDmb(){
        System.out.println("turnOff Dmb");
    }
}
