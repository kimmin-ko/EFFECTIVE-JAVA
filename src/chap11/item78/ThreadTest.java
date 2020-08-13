package chap11.item78;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    private static volatile boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
//            while (!stopRequested()) {
            while (!stopRequested) {
                i++;
                System.out.println(i);
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
//        requestStop();
        stopRequested = true;
    }

}
