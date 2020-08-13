package chap09.item64;

import chap08.item52.SetList;

import java.awt.*;
import java.lang.reflect.Method;

public class Example {
    public static void main(String[] args) {
        Class<SetList> setListClass = SetList.class;
        for (Method method : setListClass.getMethods())
            System.out.println(method.getName());
    }
}
