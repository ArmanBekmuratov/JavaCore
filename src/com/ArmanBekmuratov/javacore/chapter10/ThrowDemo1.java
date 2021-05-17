package com.ArmanBekmuratov.javacore.chapter10;

public class ThrowDemo1 {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
