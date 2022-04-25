package javaApi.objects.compare;


import java.util.Comparator;

public class StudentComparator implements Comparator<CompareExample.Student> {
    //학생 번호 비교자


    @Override
    public int compare(CompareExample.Student a, CompareExample.Student b) {
        if (a.sno < b.sno) {
            return -1;
        } else if (a.sno == b.sno) {
            return 0;
        } else {
            return 1;
        }
    }
}
