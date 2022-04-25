package javaApi.system.exit;

public class ExitExample {

    public static void main(String[] args) {
        //보안 관리자 설정
        System.setSecurityManager(new SecurityManager(){
            @Override
            public void checkExit(int status) {
                // 5가 아니면 예외발생하고 계속 실행되도록
                if(status !=5){
                    throw new SecurityException();
                }
            }
        });

        for(int i =0; i<10; i++){
            System.out.println(i);
            try{
                System.exit(i);
            }catch (SecurityException e){}
        }
    }
}
