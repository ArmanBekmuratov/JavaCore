package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner scanner = new Scanner(instr);

        scanner.findInLine("Возраст: ");
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        } else System.out.println("Error");

        scanner.close();
    }
}
