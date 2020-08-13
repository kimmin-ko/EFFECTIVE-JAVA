package chap08.item53;

import java.util.*;

public class Example {

    public static void main(String[] args) {
//        System.out.println(min(1, 2, 3));

        List<String> s = new ArrayList<>();

        System.out.println(max(s));

        String lastWOrdInLexicon = max(s).orElse("단어 없음..");

        if (lastWOrdInLexicon.equals("단어 없음..")) {
            System.out.println("단어 없음..");
        }

//        max(s).orElseThrow(IllegalArgumentException::new);

//         기본 값을 설정하는 비용이 아주 커서 부담이 될 때 사용
//         Supplier<T>를 인수 받는 orElseGet()을 사용하면 값이 처음 필요할 때 Supplier<T>를 사용해 생성하므로
//         초기 설정 비용을 낮출 수 있다.
        String elseGet = max(s).orElseGet(String::new);
        System.out.println("elseGet : " + elseGet);
        System.out.println(elseGet.equals(""));
    }

    static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    static int min(int firstArg, int... remainigArgs) {
        int min = firstArg;
        for (int arg : remainigArgs)
            if (arg < min) min = arg;
        return min;
    }

}
