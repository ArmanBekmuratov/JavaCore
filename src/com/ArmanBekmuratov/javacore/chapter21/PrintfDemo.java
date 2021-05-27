package com.ArmanBekmuratov.javacore.chapter21;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Ниже привелены некторые числовые значения в разных  форматах");

        System.out.print("Разные целоччисленные форматы:");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);
        System.out.println();
        System.out.printf("Формат с плавающей точкой: " + "%,f\n", -1234567.123);
        System.out.println();
    }
}
