package chap05.item31;

import chap05.item29.Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<>();
        numberStack.pushAll(integers);

        Set<Object> integerSet = new HashSet<>();
        numberStack.popAll(integerSet);
    }
}
