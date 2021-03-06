package com.ArmanBekmuratov.javacore.chapter11;

public class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
        System.out.println("Дочерний поток закончен");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
       new NewThread();
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}