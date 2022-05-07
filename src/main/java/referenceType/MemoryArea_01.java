package referenceType;

public class MemoryArea_01 {

    /**
     * 1. JVM 이 시작되면 운영체제에서 할당받은 메모리 영역을 세부 영역으로 구별하여 사용한다.
     *
     *  - 메소드 영역(Method Area)
     *    : 코드에서 사용되는 클래스들을 클래스 로더로 읽어, 클래스별로 런타임 상수풀, 필드 데이터, 메소드 데이터, 메소드 코드, 생성자 코드 등을 분류하여 저장
     *    : JVM 이 시작할 때 생성되고, 모든 스레드가 공유하는 영역
     *
     *  - 힙 영역(Heap Area)
     *    : 객체와 배열이 생성되는 영역이며, 여기서 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체 필드에서 참조한다.
     *    : 참조하는 변수나 필드가 없을 경우 Garbage Collector 를 실행시켜 힙 영역에서 자동으로 제거한다.
     *
     *  - 스택 영역(StackExample Area)
     *    : 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당
     *    : 메소드를 호출할 때마다 프레임을 추가(push)하고, 메소드가 종료되면 해당 프레임을 제거(pop)
     *    : 프레임 내부에 로컬 변수 스택이 있음.
     */

    public static void main(String[] args) {
        /**
         * java 클래스로 프로그램을 실행하면 JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를 호출할 때 매개값으로 전달한다.
         * 만약 java 클래스 뒤에 공백으로 구분된 문자열 목록을 주고 실행하면, 문자열 목록으로 구성된 String[] 배열이 생성되고 main() 메서드를 호출할 때 매개값으로 전달함
         * ex)  java 클래스 문자열0 문자열1 ... 문자열n-1
         */
        if(args.length != 2){
            System.out.println("프로그램의 사용법");
            System.out.println("java MainStringArrayArgument num1 num2");
            System.exit(0); // 프로그램 강제 종료
        }

        // 해당 코드 실행을 위해서는 Modify Run Configurations 에서 Program Arguments 를 입력해주면 된다.
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = "+result);

//        stringEqualsExample();
//        arrayCreateByValueListExample1();
//        arrayCreateByValueListExample2();
        arrayCreateByNewExample();
    }

    // new 연산자로 배열 생성
    public static void arrayCreateByNewExample(){
        int[] arr1 = new int[3];
        for(int i =0; i < arr1.length; i++){
            System.out.println("arr1["+i+"]= " + arr1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for(int i =0; i < arr1.length; i++){
            System.out.println("arr1["+i+"]= " + arr1[i]);
        }

        double[] arr2 = new double[3];
        for(int i =0; i < arr2.length; i++){
            System.out.println("arr2["+i+"]= " + arr2[i]);
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for(int i =0; i < arr2.length; i++){
            System.out.println("arr2["+i+"]= " + arr2[i]);
        }

        String[] arr3 = new String[3];
        for(int i =0; i < arr3.length; i++){
            System.out.println("arr3["+i+"]= " + arr3[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i =0; i < arr3.length; i++){
            System.out.println("arr3["+i+"]= " + arr3[i]);
        }
    }

    //값의 리스트로 배열 생성
    public static void arrayCreateByValueListExample2(){
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum = 0;
        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        }

        System.out.println("sum = " + sum);

        int sum2 = add(new int[]{83, 90, 87});

        System.out.println("sum2 = " + sum2);
    }

    public static int add(int[] arr){
        int sum = 0;
        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    //값 목록으로 배열 생성
    public static void arrayCreateByValueListExample1(){
        int[] scores = {83, 90, 87};

        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);

        int sum = 0;
        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        }

        System.out.println("sum = " + sum);
        double avg = (double) sum / 3;
        System.out.println("avg = " + avg);
    }

    // 문자열 비교
    private static void stringEqualsExample(){
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if(strVar1 == strVar2){
            System.out.println("strVal1 과 strVal2 는 참조가 같음");
        }else{
            System.out.println("strVal1 과 strVal2 는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVal1 과 strVal2 는 문자열이 같음");
        }

        String strVal3 = new String("신민철");
        String strVal4 = new String("신민철");

        if(strVal3 == strVal4){
            System.out.println("strVal3 과 strVal4 는 참조가 같음");
        }else{
            System.out.println("strVal3 과 strVal4 는 참조가 다름");
        }

        if(strVal3.equals(strVal4)){
            System.out.println("strVal3 과 strVal4 는 문자열이 같음");
        }
    }
}
