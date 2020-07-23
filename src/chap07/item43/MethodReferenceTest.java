package chap07.item43;

import java.util.HashMap;
import java.util.Map;

/**
 * 익명 클래스보다 나은 람다의 가장 큰 특징 -> 간결함
 * 메서드 참조(method reference)가 람다보다 더 간결함
 */
public class MethodReferenceTest {

    private static final Map<String, Integer> map = new HashMap<>();

    private static final String key;

    static {
        map.put("1", 100);
        map.put("2", 1);

        key = "2";
    }

     /**
     * map.merge(K key, V value, BiFunction remappingFunction)
     *
     * map에 key가 존재 ? key의 value 값 증가 : key와 1을 매핑
     */
    public static void MAP_MERGE_람다() {
        map.merge(key, 1, (count, incr) -> {
            System.out.println("count : " + count);
            System.out.println("incr : " + incr);
            return count + incr;
        });

        System.out.println(map.toString());
    }

    /**
     * 1. 정적 메서드 (Integer의 static int sum() 등...) 참조
     *
     * 람다 보다 좀 더 깔끔히 코드를 만들 수 있지만
     * 람다의 매개변수 이름은 프로그래머에게 좋은 가이드가 될 수 있음
     *
     * 람다로 할 수 없으면 메서드 참조로도 할 수 없음
     */
    public static void MAP_MERGE_정적_메서드_참조() {
        map.merge(key, 1, Integer::sum);

        System.out.println(map.toString());
    }

    /**
     * 3. 수신 객체(receiving object)를 특정하지 않는 비한정적(unbound) 인스턴스 메서드 참조
     */

    public static void main(String[] args) {
        MAP_MERGE_람다();
        MAP_MERGE_정적_메서드_참조();

//        Function.identity(); 대신 (x -> x) // Function<T, T>을 반환

    }
}

























