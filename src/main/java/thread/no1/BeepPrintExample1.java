package thread.no1;

import java.awt.*;

public class BeepPrintExample1 {

    //메인 스레드만 이용한 경우
    // beep 음 다섯 번 발생 후 프린트 5번이 된다.
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5; i++){
            toolkit.beep();
            try{
                Thread.sleep(500);

            }catch (Exception e){

            }

        }

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);

            }catch (Exception e){

            }
        }
    }
}
