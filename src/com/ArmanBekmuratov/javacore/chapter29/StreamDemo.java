package com.ArmanBekmuratov.javacore.chapter29;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(24);
        myList.add(42);
        myList.add(7521);
        myList.add(27);

        System.out.println("Source list: " + myList);

        Stream <Integer> myStream = myList.stream();

        Optional <Integer> minVal = myStream.min(Integer :: compare);
        if(minVal.isPresent()) System.out.println("Min optional is " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent()) System.out.println("Max optional is " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Sorted list: ");
        sortedStream.forEach((n) -> System.out.println(n + " "));

        Stream <Integer> oddVal = myList.stream().sorted().filter((n) -> (n%2) == 1);
        System.out.println("Odd values ");
        oddVal.forEach((n) -> System.out.println(n + " "));
    }
}
