package com.ArmanBekmuratov.javacore.chapter20;

import javax.swing.*;
import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter f  = new Formatter();
        Calendar cal = Calendar.getInstance();

        f.format("Today is %te of %<tB, %<tY", cal);
        System.out.println(f);
        f.close();
    }
}
