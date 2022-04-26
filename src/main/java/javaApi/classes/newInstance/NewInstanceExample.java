package javaApi.classes.newInstance;

public class NewInstanceExample {

    //동적 객체 생성 및 실행
    public static void main(String[] args) {
        try{
            //Class clazz = Class.forName("javaApi.classes.newInstance.SendAction");
            Class clazz = Class.forName("javaApi.classes.newInstance.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.excute();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
