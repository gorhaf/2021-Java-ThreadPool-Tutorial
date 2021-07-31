package main;

import java.util.concurrent.*;

public class MonitorThreadPool extends ThreadPoolExecutor {

    public MonitorThreadPool(int corePoolSize, int maximumPoolSize,
                             long keepAliveTime, TimeUnit unit,
                             BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    /**
     * 每次执行任务前调用
     */
    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        monitor();
    }

    /**
     * 每次任务完成后调用
     */
    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        monitor();
    }

    /**
     * 线程池关闭前调用
     */
    @Override
    protected void terminated() {
        monitor();
    }

    /**
     * 监控线程池情况
     */
    public void monitor() {
        System.out.print("正在工作的线程数：" + getActiveCount() + "\t");
        System.out.print("当前存在的线程数：" + getPoolSize() + "\t");
        System.out.print("历史最大的线程数：" + getLargestPoolSize() + "\t");
        System.out.print("已提交的任务数：" + getTaskCount() + "\t");
        System.out.print("已完成的任务数：" + getCompletedTaskCount() + "\t");
        System.out.println("队列中的任务数：" + getQueue().size());
    }
}