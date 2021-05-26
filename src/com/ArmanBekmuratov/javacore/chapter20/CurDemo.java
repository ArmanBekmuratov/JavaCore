package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;

public class CurDemo {
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.US);

        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Symbol: " + c.getDefaultFractionDigits());
        System.out.println("Symbol: " + c.getDisplayName());
    }
}
