package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("Копирование файла %nПередача завершена на %d%%", 88);
        System.out.println(formatter);
        formatter.close();
    }
}
