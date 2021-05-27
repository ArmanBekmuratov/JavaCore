package com.ArmanBekmuratov.javacore.chapter21;

import com.ArmanBekmuratov.javacore.chapter15.MyClass;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objOStrm =
                     new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass3 obj1 = new MyClass3("Hello", -7,2.7e10);
            System.out.println("object1: " + obj1);

            objOStrm.writeObject(obj1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objStrm =
                     new ObjectInputStream(new FileInputStream("serial")))
        {
            MyClass3 obj2 = (MyClass3)objStrm.readObject();
            System.out.println("object2: " + obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 class MyClass3 implements Serializable{
    String s;
    int i;
    double d;
    public MyClass3(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass3{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}

