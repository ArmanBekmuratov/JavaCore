package com.ArmanBekmuratov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Бэтта");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Омега");

        Stream<String> myStream = list.stream();

        Spliterator <String> spliterator = myStream.spliterator();

        while(spliterator.tryAdvance(System.out::println));
    }

}
