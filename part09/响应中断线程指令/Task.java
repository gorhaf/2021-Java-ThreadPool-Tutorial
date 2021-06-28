package main;

public class Task implements Runnable {

    /**
     * 任务编号
     */
    private final int index;

    public Task(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        // 无限输出
        for (; ; ) {
            // 当线程被中断时
            if (Thread.interrupted()) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + "：" + index);
        }
    }
}