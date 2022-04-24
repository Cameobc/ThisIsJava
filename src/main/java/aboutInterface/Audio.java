package aboutInterface;

public class Audio implements RemoteControl{

    //FILED
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println(" Audio Turn On ");
    }

    @Override
    public void turnOff() {
        System.out.println(" Audio Turn Off ");
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

        System.out.println( " Audio's Volume is "+volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute){
            System.out.println( " Audio mute ");
        }else{
            System.out.println(" Audio not mute ");
        }
    }
}
