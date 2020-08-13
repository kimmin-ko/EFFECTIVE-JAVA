package chap08.item50;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        배열_clone_테스트();
    }

    private static void 배열_clone_테스트() {
        long[] longs = new long[10];
        longs[0] = 1;

        long[] clone = longs.clone();
        clone[1] = 2;

        System.out.println("원본 객체 : " + Arrays.toString(longs));
        System.out.println("클론 객체 : " + Arrays.toString(clone));
    }

    private static void end_내부객체_변경() {
        Date start = new Date();
        Date end = new Date();

        Period p = new Period(start, end);
        end.setYear(78);
    }
}
