package com.ArmanBekmuratov.javacore.chapter20;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet1  = new BitSet(16);
        BitSet bitSet2  = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if(i%2 == 0) bitSet1.set(i);
            if(i%5 != 0) bitSet2.set(i);
        }

        System.out.println("Начальная комбинация битов в обьекте bitset1: ");
        System.out.println(bitSet1);
        System.out.println("Начальная комбинация битов в обьекте bitset2: ");
        System.out.println(bitSet2);

        bitSet2.and(bitSet1); // logic AND
        System.out.println("\nbits2 AND bits1");
        System.out.println(bitSet2);

        bitSet2.or(bitSet1); // logic or
        System.out.println("\nbits2 OR bits1");
        System.out.println(bitSet2);

        bitSet2.xor(bitSet1); // logic XOR
        System.out.println("\nbits2 XOR bits1");
        System.out.println(bitSet2);
    }
}
