package inheritance;

public class CellPhone {

    String model;
    String color;

    //constructor

    //methods
    void powerOn(){
        System.out.println("power On");
    }

    void powerOff(){
        System.out.println("power Off");
    }

    void bell(){
        System.out.println("ring ring ring");
    }

    void sendVoice(String message){
        System.out.println("myMessage = " + message);
    }

    void receiveVoice(String message){
        System.out.println("Your message = " + message);
    }

    void hangUp(){
        System.out.println("End");
    }
}
