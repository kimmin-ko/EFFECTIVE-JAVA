package chap08.item52;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = -3; i < 3; i++) {
            set.add(i); // -3 -2 -1 0 1 2
            list.add(i); // -3 -2 -1 0 1 2
        }

        for(int i = 0; i < 3; i++) {
            set.remove(i); // -3 -2 -1
            list.remove(Integer.valueOf(i)); //
        }

        System.out.println(set + " " + list);

        String s = "dd";
        StringBuffer sb = new StringBuffer("dd");

        System.out.println(s.contentEquals(sb));
//        StringBuffer
//        StringBuilder
//        CharBuffer
    }
}
