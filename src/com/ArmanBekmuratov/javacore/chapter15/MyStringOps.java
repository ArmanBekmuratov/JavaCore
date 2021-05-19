package com.ArmanBekmuratov.javacore.chapter15;

public class MyStringOps {
    static String stringReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--)
            result += str.charAt(i);

        return  result;
    }
}
class  MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "лямбда повышают эффективность java";
        String outStr;

        outStr = stringOp(MyStringOps::stringReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
