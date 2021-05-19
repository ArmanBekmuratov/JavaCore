package com.ArmanBekmuratov.javacore.chapter15;

import java.util.Locale;

public class LambdasAsArgumentsDemo {
    /**
     * Первый параметр этого методп имеет тип
     * функционального интерфейса. Следовательно, ему
     * можно передать ссылку на любой экземпляр этого интерфейса,
     * включая экземпляр, создаваемый в лямбда-выражеии. А второй параметр обозначает обра-
     * батываемою символьную строку
     */
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
      String inStr = "Лямбда повышают эффективность java";
      String outStr;

        System.out.println("Исхоная стока: " + inStr);

        outStr = stringOp(String::toUpperCase, inStr);
        System.out.println(outStr);

        outStr = stringOp((str)-> {
            String res = "";
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    res += str.charAt(i);

                return res;

        }, inStr);

        System.out.println("Это стока с удаленными пробелами " + outStr);

        StringFunc reverse = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0 ; i--)
                res += str.charAt(i);


            return res;
        };
        System.out.println(stringOp(reverse,inStr));
    }
}
