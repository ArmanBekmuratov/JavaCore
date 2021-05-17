package com.ArmanBekmuratov.javacore.chapter10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals []  = { 1, 2, 3};

        try {
            int result = a / b;
            vals [10] = 32;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Имключение перехвачено: " + exception);
        }
        System.out.println("После многократного перехвата.");
    }
}
