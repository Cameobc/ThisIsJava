package inheritance;

public class Tire {

    public int maxRotation;         // 최대 회전수(타이어 수명)
    public int accumulatedRotation; // 누적 회전수
    public String location;         // 타이어 위치

    //생성자
    public Tire(String location, int maxRotation) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    //메소드
    public boolean roll(){
        ++accumulatedRotation; // 누적 회전 수 1증가
        if(accumulatedRotation < maxRotation){
            System.out.println(location + " Tire 수명 : "+ (maxRotation - accumulatedRotation) +"회");
            return true;
        }else{
            System.out.println("*** "+location+" Tire 펑크 ***");
            return false;
        }
    }
}
