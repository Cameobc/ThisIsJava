package thread.no2;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new BeafThread();
        thread.start();

        for(int i = 0; i<5; i++){
            System.out.println("딩");
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
