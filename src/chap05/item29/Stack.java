package chap05.item29;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

//    private E[] elements;
//    @SuppressWarnings("unchecked")
//    public Stack() {
//        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
//    }

    private Object[] elements;
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if(size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked") E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void pushAll(Iterable<? extends E> src) {
        for(E e : src)
            push(e);
    }

    public void popAll(Collection<? super E> dst) {
        while(!isEmpty())
            dst.add(pop());
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}