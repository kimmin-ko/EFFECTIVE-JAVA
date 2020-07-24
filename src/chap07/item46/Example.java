package chap07.item46;

import chap06.item34.Operation;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
import static java.util.function.BinaryOperator.maxBy;

public class Example {

    static String[] words;

    static {
        words = new String[]{"to", "to", "this", "this", "this", "min", "get", "get", "get", "from"};
    }

    public static void main(String[] args) {

//        examCollectors();

//        topThree();

        // IllegalStateException: Duplicate key to 발생
//        스트림원소_다수키_사용();

//        toMap_merge_사용();

//        음악가_베스트앨범_매핑();

//        마지막값_취하기();
    }



    static void 마지막값_취하기() {
        Map<String, String> strMap =
                Arrays.stream(words).collect(toMap(String::toLowerCase, e -> e, (odlVal, newVal) -> newVal));

        System.out.println(strMap.toString());
    }

        static void 음악가_베스트앨범_매핑() {
            Artist min = new Artist("min");
            Artist zzangu = new Artist("zzangu");
            Artist chulsu = new Artist("chulsu");

            List<Album> albums = Arrays.asList(
                    new Album(min, 120),
                    new Album(min, 99),
                    new Album(min, 32),
                    new Album(zzangu, 520),
                    new Album(zzangu, 53),
                    new Album(chulsu, 990),
                    new Album(chulsu, 2352),
                    new Album(chulsu, 334));

        Map<Artist, Album> topHits =
                albums.stream().collect(toMap(Album::artist, album -> album, maxBy(comparing(Album::sales))));

        topHits.forEach((artist, album) -> System.out.println("atist : " + artist.name + ", album : " + album.sales));
    }

    static class Album {
        private final Artist artist;
        private final int sales;

        Album(Artist artist, int sales) {
            this.artist = artist;
            this.sales = sales;
        }

        public Artist artist() {
            return this.artist;
        }

        public int sales() {
            return this.sales;
        }
    }

    static class Artist {
        private final String name;

        Artist(String name) {
            this.name = name;
        }

        public String name() {
            return this.name;
        }
    }

    static void toMap_merge_사용() {
        Map<String, String> strMap =
                Arrays.stream(words).collect(toMap(String::toLowerCase, e -> e, String::concat));

        System.out.println(strMap.toString());
    }

    static void 스트림원소_다수키_사용() {
        Map<String, String> strMap = Arrays.stream(words).collect(toMap(String::toLowerCase, e -> e));

        System.out.println(strMap.toString());
    }

    static void topThree() {
        Map<String, Long> freqMap = Arrays.stream(words).collect(groupingBy(String::toLowerCase, counting()));
        List<String> topThree = freqMap.keySet().stream()
                .sorted(comparing(freqMap::get).reversed())
                .limit(3)
                .collect(toList());

        topThree.forEach(str -> System.out.println(str + " "));
    }

    static void examCollectors() {
        Map<String, Long> freqMap = Arrays.stream(words).collect(groupingBy(String::toLowerCase, counting()));
        Set<String> freqSet = Arrays.stream(words).collect(toSet());
        List<String> freqList = Arrays.stream(words).collect(toList());
        String freqStr = Arrays.stream(words).collect(joining());

        System.out.println(freqMap);

        freqSet.forEach(word -> System.out.print(word + " "));
        System.out.println();

        freqList.forEach(word -> System.out.print(word + " "));
        System.out.println();

        System.out.println(freqStr);
    }
}