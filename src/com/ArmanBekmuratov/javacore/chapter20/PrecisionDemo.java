package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("%.4f", 123.241532532);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%16.2e", 123.2414124124);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%.16s", "Форматировать в Джава теперь очень просто. ");
        System.out.println(formatter);
        formatter.close();
    }
}
