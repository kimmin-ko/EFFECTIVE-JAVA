package chap07.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> streamOfList = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        Stream<String> generateStream = Stream.generate(() -> "gen").limit(5);
        generateStream.forEach(System.out::print);

        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5);
        iteratedStream.forEach(System.out::print);

        IntStream charsStream = "Stream".chars();
        charsStream.forEach(System.out::print);

        System.out.println();
    }
}
