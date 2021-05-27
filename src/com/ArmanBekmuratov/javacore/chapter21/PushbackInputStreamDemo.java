package com.ArmanBekmuratov.javacore.chapter21;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if (a==4) a = 0\n";
        byte buf [] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;

        try(PushbackInputStream f = new PushbackInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if((c = f.read()) == '=') System.out.println(".eq.");
                        else {
                            System.out.println("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.println((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
