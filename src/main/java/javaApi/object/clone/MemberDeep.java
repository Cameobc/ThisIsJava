package javaApi.object.clone;

import java.util.Arrays;

public class MemberDeep implements Cloneable{

    //clone() 를 재정의하여 깊은 복제로 변경
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public MemberDeep(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사를 해서 name, age 를 복제한다.
        MemberDeep cloned = (MemberDeep) super.clone(); // object 의 clone() 호출
        //scores 를 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // clone() 메소드 재정의
        //car 를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        //깊은 복제된 MemberDeep 객체를 리턴
        return cloned;
    }

    public MemberDeep getMemberDeep(){
        MemberDeep cloned= null;
        try {
            cloned = (MemberDeep) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cloned;
    }
}
