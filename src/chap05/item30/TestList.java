package chap05.item30;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestList {

    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if(list == null) throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
        E result = null;

        for(E e : list) {
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        max(list);
    }

}