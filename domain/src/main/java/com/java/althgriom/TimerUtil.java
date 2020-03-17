package com.java.althgriom;


import java.util.Timer;
import java.util.TimerTask;

public class TimerUtil {

    public  static void main(String[] args) {
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello~");
            }
        }, 100000, 10);
    }
}
