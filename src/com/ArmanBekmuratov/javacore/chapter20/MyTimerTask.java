package com.ArmanBekmuratov.javacore.chapter20;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Задание по таймеру выполняется");
    }
}

class TTest {
    public static void main(String[] args) {
        MyTimerTask timerTask = new MyTimerTask();
        Timer timer = new Timer();

        timer.schedule(timerTask, 1000,500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
    }
}
