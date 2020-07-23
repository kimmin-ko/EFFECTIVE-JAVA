package chap07.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntermediateOperations {
    public static void main(String[] args) {
        test7();
    }

    private static void test7() {
        System.out.println(IntStream.of(1,2,3).count());
        OptionalInt optionalMin = IntStream.of().min();
        System.out.println(optionalMin);

        DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
//        DoubleStream.of()
                .average()
                .ifPresent(System.out::println);
    }

    private static void test6() {
        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .peek(System.out::println)
                .sum();

        System.out.println("sum : " + sum);
    }

    private static void test5() {
        List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        lang.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("--");

        lang.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("--");

        lang.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        System.out.println("--");

        lang.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .forEach(System.out::println);
    }

    private static void test4() {
        IntStream.of(44, 90, 32, 99, 85, 92, 99, 30, 35)
                .sorted()
                .boxed()
                .collect(Collectors.toList())
                .forEach(integer -> System.out.print(integer + " "));
    }

    private static void test3() {
        List<Jumsu> jumsus = Arrays.asList(new Jumsu("min", 99, 85, 92),
                new Jumsu("chulsu", 44, 90, 32),
                new Jumsu("dayoung", 99, 30, 35));

        jumsus.stream()
                .flatMapToInt(jumsu -> IntStream.of(jumsu.getKor(), jumsu.getEng(), jumsu.getMath()))
                .average().ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));
    }

    private static void test2() {
        List<List<String>> lists = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));

        List<String> newLists = lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(newLists);
    }

    private static void test1() {
        List<String> names = Arrays.asList("min", "hye", "sang", "ho", "chul");
        names
                .stream()
                .filter(name -> name.contains("h"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static class Jumsu {
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Jumsu(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }
    }
}