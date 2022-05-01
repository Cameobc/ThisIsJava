package generic.wildcard;

import inheritance.Student;
import nestedClassAndInterface.Person;

import java.util.Arrays;

public class WildCardExample {
    // 모든 과정
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    // 학생 과정
    public static void registerCourseStudent(Course<? extends Student> course){
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    // 직장인과 일반 과정
    /*public static void registerCourserWorker(Course<? super Worker> course){
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Worker>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new Person("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        //학생 과정만 등록 가능
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

        // 직장인과 일반인 과정만 등록 가능
        registerCourserWorker(workerCourse);
        registerCourse(personCourse);
    }*/
}
