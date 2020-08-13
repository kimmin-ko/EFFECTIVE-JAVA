package chap08.item49;

import java.util.ArrayList;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {
//        test(null, 1);

        sort(null, 10, 10);
    }

    public static void test(String a, int b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
    }

    private static void sort(long[] a, int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;

        System.out.println(a);
    }

}
