package com.ArmanBekmuratov.javacore.chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3,4 5 6 7,4 9,1 10,5 готово");
        fout.close();
        FileReader fin = new FileReader("Test.txt");
        Scanner scanner = new Scanner(fin);

        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            } else {
                String str = scanner.next();
                if(str.equals("готово")) break;
                else {
                    System.out.println("Error");
                    return;
                }
            }
        }
        scanner.close();
        System.out.println("Average equals " + sum/count);
    }
}
