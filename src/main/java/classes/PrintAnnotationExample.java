package classes;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) {

        //service 클래스로부터 메소드 정보를 얻음(리플렉션)
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        //method 객체를 하나씩 처리
        for(Method method : declaredMethods){
            //PrintAnnotation 적용되었나 확인
            if(method.isAnnotationPresent(PrintAnnotation.class)){
                //PrintAnnotation 객체 얻기
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                //메소드 이름 출력
                System.out.println("[" + method.getName() + "]");
                //구분선 출력
                for(int i = 0; i<printAnnotation.number(); i++){
                    System.out.print(printAnnotation.value());
                }

                System.out.println();

                try{
                    //메소드 호출
                    // Service 객체를 생성하고 생성된 Service 객체의 메소드를 호출하는 코드이다.
                    method.invoke(new Service());
                }catch (Exception e){
                    System.out.println();
                }
            }
        }
    }
}
