package chap11.item78;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("------- My Thread START -------");
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
            System.out.println("my : " + sum);
        }
        System.out.println("------- My Thread START -------");
    }
}

class MyThreadTest {
    public static void main(String[] args) {
        Runnable r = new MyThread();
        Thread myThread = new Thread(r);
        myThread.start();

        System.out.println("------- Main Thread START -------");
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
            System.out.println("main : " + sum);
        }
        System.out.println("------- Main Thread START -------");
    }
}