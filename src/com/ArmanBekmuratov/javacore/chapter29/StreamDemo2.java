package com.ArmanBekmuratov.javacore.chapter29;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(21);
        myList.add(22);
        myList.add(33);
        myList.add(41);
        myList.add(24);

        Optional<Integer> productObj =
                myList.stream().reduce((a, b) -> a * b);
        if(productObj.isPresent()) System.out.println("Произведение в виде обьекта типа Optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a*b);
        System.out.println("Произведение в виде значения типа int " + product);
    }
}
