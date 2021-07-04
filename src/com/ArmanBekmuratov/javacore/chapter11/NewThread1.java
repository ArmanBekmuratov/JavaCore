package com.ArmanBekmuratov.javacore.chapter11;

public class NewThread1 implements Runnable{
    String name;
    Thread t;

    public NewThread1(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread "  + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("name " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread1("first");
        new NewThread1("second");
        new NewThread1("third");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток прерван");
    }
}
