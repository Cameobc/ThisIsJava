package referenceType;

import java.util.Calendar;

public class EnumerationType {

    /**
     * 한정된 값만을 갖는 데이터 타입이 열거 타입으로, 열거 타입은 몇 개의 열거 상수 중에서 하나의 상수를 저장하는 데이터 타입이다.
     * 열거 타입을 선언하기 위해서는 먼저 열거 타입의 이름을 정하고, 열거 타입 이름으로 소스 파일을 생성해야 함.
     * 열거 타입 이름은 관례적으로 첫 문자를 대문자로 하고, 나머지는 소문자로 구성
     * 만약 여러 단어로 구성된 이름이라면 단어 첫 문자는 대문자로 하는 것이 관례이다
     * 열거 상수는 열거 타입의 값으로 사용되며 관례적으로 열거 상수는 모두 대문자로 작성하며, 여러 단어로 구성된 경우에는 단어 사이를 _ 로 연결한다.
     */

    public static void main(String[] args) {
        // 동일한 객체를 참조하기 때문에 true 값이 나옴
        Week today = Week.SUNDAY;
        System.out.println(today == Week.SUNDAY);

//        enumWeekExample();

        //열거 객체의 메서드
        // name()
        String name = today.name();

        // ordinal()  전체 열거 객체 중 몇 번째 열거 객체인지
        int ordinal = today.ordinal();

        // compareTo() : 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지 비교
        Week day1 = Week.MONDAY;
        Week day2 = Week.FRIDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);

        // valueOf() : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
        Week weekDay = Week.valueOf("FRIDAY");

        // values() : 열거 타입의 모든 열거 객체를 배열로 만들어 리턴함.
        Week[] days = Week.values();
        for(Week d : days){
            System.out.println("days = " + d);
        }

        System.out.println("name = " + name);
        System.out.println("ordinal = " + ordinal);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }

    // 열거 타입과 열거 상수
    public static void enumWeekExample(){
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }


        System.out.println("today = " + today);

        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        }else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }
}
