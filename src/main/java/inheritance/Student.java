package inheritance;

public class Student extends People{

    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // 주석 처리 시 에러 발생 Implicit super constructor People() is undefined. Must explicitly invoke another constructor
        this.studentNo = studentNo;
    }
}
