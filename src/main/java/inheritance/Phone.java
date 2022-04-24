package inheritance;

public abstract class Phone {
    //필드
    public String owner;

    //constructor

    public Phone(String owner) {
        this.owner = owner;
    }

    //methods
    public void turnOn(){
        System.out.println(" 폰 전원을 켭니다. ");
    }

    public void turnOff(){
        System.out.println(" 폰 전원을 끕니다. ");
    }
}
