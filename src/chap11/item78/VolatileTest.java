package chap11.item78;

import java.util.concurrent.atomic.AtomicLong;

public class VolatileTest {
//    private static long nextSerialNumber = 0;
    private static final AtomicLong nextSerialNumber = new AtomicLong();

    public static long generateSerialNumber() {
        // ++ 연산이 nextSerialNumber 값을 get 한 후 1을 더해주기 때문에 스레드
        return nextSerialNumber.getAndIncrement();
    }
}