package com.ArmanBekmuratov.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //String use
        SomeFunc <String> reverse = (str) -> {
            String res = "";
            for (int i = str.length(); i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        // and now Int case of SomeFunc

        SomeFunc <Integer> factorial = (n) -> {
            int res = 0;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };

        System.out.println(factorial.func(3));
        System.out.println(factorial.func(5));
    }
}
