package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0;
        int [] bell = new int[10];

        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for (int j = 0; j < 10; j++, t += 5)
                if(val < t) {
                    bell[j]++;
                    break;
                }
        }

        System.out.println("Average of all " + sum/100);

        for (int i = 0; i < 10; i++) {
            for (int j = bell[i]; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
