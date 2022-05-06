package collectionFramework.map.hashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(" 아이디와 비밀번호를 입력해 주세요.");
            System.out.println(" ID : ");
            String id = sc.nextLine();

            System.out.println(" PW : ");
            String password = sc.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println(" login success !");
                }else{
                    System.out.println(" password is not matched ");
                }
            }else{
                System.out.println(" id doesn't exist! ");
            }
        }
    }
}
