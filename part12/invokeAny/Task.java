package main;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

    /**
     * 任务编号
     */
    private final int index;

    public Task(int index) {
        this.index = index;
    }

    @Override
    public Integer call() throws Exception {
        // 使当前线程休眠1秒钟
        Thread.sleep(1000);
        return index;
    }
}