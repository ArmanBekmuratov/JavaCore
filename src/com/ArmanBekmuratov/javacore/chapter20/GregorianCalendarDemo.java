package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String [] months = {
                "Jan","Feb", "Mar", "Apr",
                "May","Jun", "Jul", "Aug",
                "Sep","Oct", "Nov", "Dec"
        };
        int year;

        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.print(year = gcalendar.get(Calendar.YEAR));
        System.out.println(gcalendar.get(Calendar.HOUR));
        System.out.println(gcalendar.get(Calendar.MINUTE));
        System.out.println(gcalendar.get(Calendar.SECOND));

        if(gcalendar.isLeapYear(year)) {
            System.out.println("Текущий год высокосный");
        } else System.out.println("Текущий год невысокосный");
    }
}
