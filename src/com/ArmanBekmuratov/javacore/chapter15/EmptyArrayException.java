package com.ArmanBekmuratov.javacore.chapter15;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
