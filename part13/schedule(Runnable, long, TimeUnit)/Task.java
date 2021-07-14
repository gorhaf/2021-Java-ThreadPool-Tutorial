package main;

import java.time.LocalTime;

public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }
}