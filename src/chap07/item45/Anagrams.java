package chap07.item45;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.math.BigInteger.*;

public class Anagrams {
    public static void main(String[] args) throws IOException {
//        version1(args);
//        version2(args);
//        version3();
    }

    private static void version3() {
        Stream<String> words = Stream.of("dsjkfnoiwe", "dsfojqdd", "apple", "melon", "dsfojqdd");
        Map<Object, List<String>> maps = words.collect(groupingBy(Anagrams::alphabetize));

        maps.values().forEach(c -> System.out.println(c.size() + ": " + c));

        System.out.println(maps.toString());
    }

    private static void version2(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        try (Stream<String> words = Files.lines(path)) {
            words.collect(groupingBy(Anagrams::alphabetize))
                    .values()
                    .stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.println(g.size() + ": " + g));
        }

    }

    private static void version1(String[] args) throws IOException {
        File dictionary = new File(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
            }
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
