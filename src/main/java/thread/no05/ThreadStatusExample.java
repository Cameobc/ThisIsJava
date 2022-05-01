package thread.no05;

public class ThreadStatusExample {

    public static void main(String[] args) {
        StatePrintThread thread = new StatePrintThread(new TargetThread());
        thread.start();
    }
}
