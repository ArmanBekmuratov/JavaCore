package com.ArmanBekmuratov.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String[100];
        System.out.println("Введите строки текста");
        System.out.println("Введите 'stop' для завершения");
        for (int i = 0; i < 100; i++) {
            strings[i] = br.readLine();
            if(strings[i].equals("stop")) break;
        }
        System.out.println("\nСодержимое вашего файла");
        for (int i = 0; i < 100; i++) {
            if(strings[i].equals("stop")) break;;
            System.out.println(strings[i]);
        }
    }
}
