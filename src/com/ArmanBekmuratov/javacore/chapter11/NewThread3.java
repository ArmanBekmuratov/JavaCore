package com.ArmanBekmuratov.javacore.chapter11;

public class NewThread3 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread3(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 15; i > 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " завершен");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("Один");
        NewThread3 ob2 = new NewThread3("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобнавление потока Один");
            Thread.sleep(1000);
            ob2.mySuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Возобнавление потока Два");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Главный поток завершен");
    }
}
