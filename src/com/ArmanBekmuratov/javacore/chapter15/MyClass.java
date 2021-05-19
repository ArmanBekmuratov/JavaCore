package com.ArmanBekmuratov.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyClass {
    private int val;

    MyClass(int val) {this.val = val;}

    int getVal(){return val;}
}

class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        List <MyClass> classes = new ArrayList<>();

        classes.add(new MyClass(4));
        classes.add(new MyClass(5));
        classes.add(new MyClass(3));
        classes.add(new MyClass(2));
        classes.add(new MyClass(6));

        MyClass maxValObj = Collections.max(classes, UseMethodRef::compareMC);

        System.out.println("Максимальное значение равно " + maxValObj.getVal());
    }
}
