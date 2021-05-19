package com.ArmanBekmuratov.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("Even");
        if (!isEven.test(9))
            System.out.println("Odd");

        NumericTest isPos = n -> n >= 0;

        if (isPos.test(1))
            System.out.println("pos");
        if (!isPos.test(-1))
            System.out.println("neg");
    }
}
