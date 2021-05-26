package com.ArmanBekmuratov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Бэтта");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Омега");

        Stream<String> stringStream = list.stream();

        Spliterator<String> spliterator = stringStream.spliterator();

        Spliterator<String> spliterator1 = spliterator.trySplit();

        if (spliterator1 != null) {
            System.out.println("Результат выводимый итератором spliterator1");
            spliterator1.forEachRemaining((n) ->
                    System.out.println(n));
        }

        System.out.println("\n Результат выводимый итератором spliterator");
        spliterator.forEachRemaining(System.out::println);
    }
}
