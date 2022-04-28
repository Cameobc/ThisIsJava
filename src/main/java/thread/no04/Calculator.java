package thread.no04;

public class Calculator {

    //공유객체
    private int memory;

    public int getMemory() {
        return memory;
    }


    public void setMemory(int memory) {
        synchronized (this){ // 공유 객체 참조
            this.memory = memory;
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+ " : "+this.memory);
        }

    }

    /*public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+ " : "+this.memory);
    }*/

    /*public void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+ " : "+this.memory);
    }*/
}
