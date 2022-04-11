package inheritance;

public class StudentExample {

    public static void main(String[] args) {
        Student student = new Student("AA", "12345-67890", 1);

        System.out.println("name is " + student.name);
        System.out.println("ssn is " + student.ssn);
        System.out.println("no is " + student.studentNo);
    }
}
