package com.ArmanBekmuratov.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;

            System.out.println("a = " + a);
            try {
                //Вложенныей блок try
                /* Если указан один аргумент командной строки,
                 то исключение в связи с делением на нуль будет
                 сгенерировано в следующем коде */
                if (a == 1) a = a / (a - a); //divide by 0
                if (a == 2) {
                    int c [] = {1};
                    c [243] = 99; // exception ArrayIndexOutBoundEx
                }
            }  catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of Array " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero " + e );
        }
    }
}
