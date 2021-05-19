package com.ArmanBekmuratov.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n,d) -> (n % d) == 0;

        if (isFactor.test(10,2)) System.out.println("Число 2 являеется множителем числа 10");
        if (!isFactor.test(10,3)) System.out.println("Число 3 не являеется множителем числа 10");
    }
}
