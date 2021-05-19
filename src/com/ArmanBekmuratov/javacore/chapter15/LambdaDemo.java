package com.ArmanBekmuratov.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 134.24;
        System.out.println("Фиксированное значение: " + myNumber.getValue());
        myNumber = () -> Math.random() * 100;

        System.out.println("Случайное выражение: " + myNumber.getValue());
        System.out.println("Случайное выражение: " + myNumber.getValue());
    }
}
