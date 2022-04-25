package javaApi.objects.isNullNonNullRequireNonNull;

import java.util.Objects;

public class NullExample {
    
    //nullable 조사

    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1)); //홍길동
        
        try{
            String name = Objects.requireNonNull(str2); //nullpointerexception
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            String name = Objects.requireNonNull(str2, "이름이 없습니다."); //nullpointerexception
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요."); //람다식
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
