package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar cal = Calendar.getInstance();

        formatter.format("%tr", cal);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tc", cal);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tl:%tM", cal, cal);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tB %tb %tm", cal,cal,cal);
        System.out.println(formatter);
    }
}
