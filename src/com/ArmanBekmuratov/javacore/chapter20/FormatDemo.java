package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Форматтировать %s is simple just %d %f", "Java", 13,412.3);
        System.out.println(fmt);
        fmt.close();
    }
}
