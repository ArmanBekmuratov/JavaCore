package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if (noVal.isPresent()) System.out.println("Nothing");
        else System.out.println("Object noVal has nothing");
        if (hasVal.isPresent()) System.out.println(hasVal.get());

        String defStr = noVal.orElse("DefaultString");
        System.out.println(defStr);
    }
}
