package main;

public class Task implements Runnable {
    /**
     * 执行时间
     */
    private int timeout;

    public Task(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public void run() {
        try {
            // 使当前线程休眠指定时间
            Thread.sleep(timeout * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}