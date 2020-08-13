package chap09.item63;

import java.time.Instant;

public class Example {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = statement();
        String s2 = statement2();
        System.out.println(s);
        System.out.println(s2);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    public static String statement() {
        String result = "";
        for (int i = 0; i < 10; i++)
            result += "abc";
        return result;
    }

    public static String statement2() {
        StringBuilder b = new StringBuilder(100);
        for (int i = 0; i < 10; i++)
            b.append("abc");

        return b.toString();
    }
}
