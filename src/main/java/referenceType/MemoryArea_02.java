package referenceType;

public class MemoryArea_02 {

    public static void main(String[] args) {

//        arrayInArrayExample();
//        arrarReferenceObjectExample();
//        arrayCopyByForExample();
//        arrayCopyExample();
        advancedForExample();
    }

    //향상된 for 문
    public static void advancedForExample(){
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0 ;
        for (int score : scores) {
            sum += score;
        }

        System.out.println("점수 총합 : "+sum);

        double avg = (double) sum / scores.length;
        System.out.println("avg = " + avg);
    }

    //배열 복사
    // 배열은 한 번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장 공간이 필요하다면 보다 큰 배열을 새로 만들고, 이전 배열로부터 항목값을 복사해야 한다.
    // for 문을 사용하거나 System.arraycopy() 메소드를 사용

    // 참조 타입 배열의 경우 배열 복사가 되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일하며, 이를 얕은 복사라 한다.
    // 깊은 복사란 참조하는 객체도 별도로 생성하는 것을 말한다.
    public static void arrayCopyExample(){
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // scr : 원본 배열, scrPos: 원본배열에서 복사를 시작할 인덱스, dest: 새 배열, destPos: 새배열 붙여넣기 시작 인덱스, length: 복사할 개수
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        for(int i = 0; i < newStrArray.length; i++){
            System.out.println("newStrArray["+i+"] = " + newStrArray[i]);
        }
    }

    public static void arrayCopyByForExample(){
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for(int i = 0; i< oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for(int i = 0; i < newIntArray.length; i++){
            System.out.println("newIntArray["+i+"] = " + newIntArray[i]);
        }

    }


    //객체를 참조하는 배열
    public static void arrarReferenceObjectExample(){
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }

    // 다차원 배열은 행렬과 비슷하다.
    // int[][] sample = new int [2][3]; stack 영역에 simple 를, heap 영역에 세 개의 배열([2], [3], [2][3])을 생성한다.
    // 배열 속의 배열
    public static void arrayInArrayExample(){

        int[][] mathScores = new int[2][3];
        for(int i = 0; i< mathScores.length; i++){
            for(int j = 0; j<mathScores[i].length; j++){
                System.out.println("mathScores["+i+"]"+"["+j+"]= " + mathScores[i][j]);
            }
        }

        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for(int i = 0; i< englishScores.length; i++){
            for(int j = 0; j<englishScores[i].length; j++){
                System.out.println("englishScores["+i+"]"+"["+j+"]= " + englishScores[i][j]);
            }
        }

        System.out.println();

        int[][] javaScores = {{95, 80}, {92, 96, 80}};
        for(int i = 0; i< javaScores.length; i++){
            for(int j = 0; j<javaScores[i].length; j++){
                System.out.println("javaScores["+i+"]"+"["+j+"]= " + javaScores[i][j]);
            }
        }

    }
}
