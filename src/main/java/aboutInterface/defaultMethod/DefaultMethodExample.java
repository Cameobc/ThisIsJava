package aboutInterface.defaultMethod;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterface mi1 = new MyclassA();
        mi1.method1();
        mi1.method2();

        mi1 = new MyClassB();
        mi1.method1();
        mi1.method2();
    }
}
