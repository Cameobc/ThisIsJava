package variable;

public class FromIntToFloat {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int)num3;
        int result = num1 - num2;
        // int 값을 손실 없이 float 값으로 변환하려면 기수 23비트로 표현 가능한 값이어야 함.
        // 123456780은 23비트로 표현이 불가능하기 때문에 근사치로 변환되며 이때 정밀도 손실이 발생한다.
        System.out.println("result :: " +result);
    }
}
