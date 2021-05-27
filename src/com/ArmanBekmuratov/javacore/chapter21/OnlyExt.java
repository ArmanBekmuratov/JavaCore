package com.ArmanBekmuratov.javacore.chapter21;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {

    String txt;

    public OnlyExt(String txt) {
        this.txt = "." + txt;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(txt);
    }
}

class DirListOnly {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\abekm\\Desktop";
        File f1 = new File(dirname);
        FilenameFilter ff = new OnlyExt("txt");
        String  s [] = f1.list(ff);

        for (String file : s) {
            System.out.println(file);
        }
    }
}