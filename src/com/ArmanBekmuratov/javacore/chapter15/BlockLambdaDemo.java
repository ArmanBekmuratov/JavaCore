package com.ArmanBekmuratov.javacore.chapter15;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1 ; i <= n ; i++) {
                result *= i;

            } return result;
        };

        System.out.println("Factorial of 3 equals" + factorial.func(3));
        System.out.println("Factorial of 5 equals" + factorial.func(5));
    }
}
