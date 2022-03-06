package loop;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        question07();
    }

    public static void question07(){
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while(run){
            System.out.println("---------------------------");
            System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------");
            System.out.print("선택 > ");
            int reuslt = scanner.nextInt();

            switch (reuslt){
                case 1:
                    System.out.print("예금액>");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔고>"+balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            
            
        }
        System.out.println("프로그램 종료");
    }

    public static void question04(){
        boolean flag = true;
        while (flag){
            int x = (int)(Math.random()*6) +1;
            int y = (int)(Math.random()*6) +1;
            System.out.println("(" +x +"," + y+")");
            if(x +y == 5){
                flag = false;
            }
        }
    }

    public static void question05(){

        for(int i = 1; i < 11; i++){
            for(int j = 1; j< 11; j ++){
                if(4*i+5*j == 60){
                    System.out.println("("+i+", "+j+")");
                }
            }
        }
    }

    public static void question06(){
        for(int i =0; i<6; i++){
            for(int j =0; j<i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
