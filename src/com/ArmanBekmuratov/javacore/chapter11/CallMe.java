package com.ArmanBekmuratov.javacore.chapter11;

public class CallMe {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller( CallMe target, String msg) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Добро пожаловать ");
        Caller ob2 = new Caller(target, "в синхроонизированный ");
        Caller ob3 = new Caller(target, " мир");


        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
