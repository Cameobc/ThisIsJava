package aboutInterface;

public class SmartTelevision implements RemoteControl, Searchable{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println(" Smart Tv Turn On ");
    }

    @Override
    public void turnOff() {
        System.out.println(" Smart Tv Turn off ");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }

        System.out.println( " Smart TV's Volume is "+volume);
    }

    @Override
    public void search(String url) {
        System.out.println( "search "+ url);
    }
}
