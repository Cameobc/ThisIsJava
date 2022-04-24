package nestedClassAndInterface;

public class Outter {

    //java 7 이전
    public void method1(final int arg){
        final int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner{
            public void method(){
                int result = arg + localVariable;
            }
        }
    }

    // java 8 이후
    public void mehtod2(int arg){
        int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner{
            public void method(){
                int reulst = arg+localVariable;
            }
        }
    }

}
