package javaApi.system.GcExample;

public class GcExample {

    public static void main(String[] args) {

        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.println("emp 가 최종적으로 참조하는 사원번호:");
        System.out.println(emp.eno);
        System.gc();

    }

    static class Employee{
        public int eno;

        public Employee(int eno) {
            this.eno = eno;
            System.out.println("Employee("+ eno+") 가 메모리에 생성됨"); //소멸자
        }

        public void finalize(){
            System.out.println("Employee("+ eno+") 가 메모리에서 제거됨"); //소멸자
        }
    }
}
