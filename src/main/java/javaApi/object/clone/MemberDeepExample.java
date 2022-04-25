package javaApi.object.clone;

public class MemberDeepExample{

    public static void main(String[] args) {
        // 원본 객체 생성
        MemberDeep original = new MemberDeep("홍길동", 25, new int[]{90, 90}, new Car("소나타"));

        //복제 객체를 얻은 후 참조 개체의 값을 변경
        MemberDeep cloned = original.getMemberDeep();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜져";

        System.out.println("복제 객체의 필드값");
        System.out.println("name : "+ cloned.name);
        System.out.println("age : "+ cloned.age);
        System.out.println("score : {");
        for(int s : cloned.scores){
            System.out.print(s+ ",");
        }
        System.out.println("car : "+ cloned.car.model);
        System.out.println();

        System.out.println("원본 객체의 필드값");
        System.out.println("name : "+ original.name);
        System.out.println("age : "+ original.age);
        System.out.println("score : {");
        for(int s : original.scores){
            System.out.print(s+ ",");
        }
        System.out.println("car : "+ original.car.model);
    }
}
