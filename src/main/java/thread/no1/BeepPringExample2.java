package thread.no1;

import java.awt.*;

public class BeepPringExample2 {

    //메인 스레드와 작업 스레드 동시 실행
    public static void main(String[] args) {
        /*Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);*/
        /*
        //case 02 익명 객체 이용
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i =0; i<5; i++){
                    toolkit.beep();
                    try{Thread.sleep(500);}
                    catch (Exception e){}
                }
            }
        });
        */
        // case 03 람다식 이용
        Thread thread = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i =0; i<5; i++){
                toolkit.beep();
                try{Thread.sleep(500);}
                catch (Exception e){}
            }
        });
        thread.start();

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);

            }catch (Exception e){}
        }
    }
}
