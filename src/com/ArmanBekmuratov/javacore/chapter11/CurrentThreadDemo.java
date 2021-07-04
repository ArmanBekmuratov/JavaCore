package com.ArmanBekmuratov.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is " + t);
        t.setName("My Thread");
        System.out.println("После изменения имени потока исполнения " + t);

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
