package aboutInterface.defaultMethodInheritance;

public class Example {

    public static void main(String[] args) {

        // 구현해서 사용해야 하며, 디폴트 메소드는 그냥 실행 가능
        Childinterface1 ci1 = new Childinterface1() {
            @Override
            public void method3() {

            }

            @Override
            public void method1() {

            }
        };
        
        // method2는 호출 가능
        ChildInterface2 ch2 = new ChildInterface2() {
            @Override
            public void method3() {
                
            }

            @Override
            public void method1() {

            }
        };

        // 모두 구현하여야함
        ChildInterface3 ch3 = new ChildInterface3() {
            @Override
            public void method2() {

            }

            @Override
            public void method3() {

            }

            @Override
            public void method1() {

            }
        };

    }
}
