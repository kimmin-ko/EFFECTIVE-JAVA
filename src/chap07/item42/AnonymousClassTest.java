package chap07.item42;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class AnonymousClassTest {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("2 김민 ", "3 입니다. ", "1 나는 ", "4 ㅎㅎ");
        words.sort(comparingInt(String::length));

        System.out.println(words);
    }

}
