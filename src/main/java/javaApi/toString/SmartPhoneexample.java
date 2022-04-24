package javaApi.toString;

public class SmartPhoneexample {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String obj1 = myPhone.toString();
        System.out.println(obj1);
    }
}
