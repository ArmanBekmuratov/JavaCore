package com.ArmanBekmuratov.javacore.chapter10;

public class MethNestTry {
    static void nestTry(int a) {
        try {
            if (a == 1) a = a / (a-a);
            if (a == 2) {
                int c [] = {2};
                c [42] = 321;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 32 / a;
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero" + e);
        }
    }
}
