package inheritance;

public class DmbCellPhoneExample {

    public static void main(String[] args) {

        DmbCellPhone dmbCellPhone = new DmbCellPhone("java", "black", 10);

        System.out.println("model :: "+ dmbCellPhone.model);
        System.out.println("color :: "+ dmbCellPhone.color);

        System.out.println("channel :: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello??");
        dmbCellPhone.receiveVoice("Hi! My name is AA!");
        dmbCellPhone.sendVoice("Nice to meet you");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(15);
        dmbCellPhone.turnOffDmb();
    }
}
