package com.ArmanBekmuratov.javacore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        // Локальная переменная, которая может быть захваачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            //такое применение переменной num допустимо,
            // поскольку она не видоизменяется
            int v = num  + n;
            return v;

        };
    }
}
