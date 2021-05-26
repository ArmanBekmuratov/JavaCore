package com.ArmanBekmuratov.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class SteamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.3);
        myList.add(12.3);
        myList.add(2.4);
        myList.add(13.6);
        myList.add(11.25);

        myList.forEach(
                (a) -> System.out.println(a + " ")
        );

        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.println("Максимально допустимые пределы: ");
        cStrm.forEach((a) -> System.out.println(a + " "));
    }
}
