package main;

public class Task implements Runnable {

    private final int index;

    public Task(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：" + index);
    }
}