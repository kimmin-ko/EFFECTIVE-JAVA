package chap07.item44;

import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionalTest {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator; // T apply(T t), String::toLowerCase
        BinaryOperator<BigInteger> binaryOperator; // T apply(T t1, T t2), BigInteger::add
        Predicate<Set<String>> predicate; // boolean test(T t), Collection::isEmpty
        Function<String, List<String>> function; // R apply(T t), Arrays::asList
        Supplier<Instant> supplier; // T get(), Instant::now
        Consumer<String> consumer; // void accept(T t), System.out::println
    }
    
}
