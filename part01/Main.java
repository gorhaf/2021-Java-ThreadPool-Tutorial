package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 【B站】人人都是程序员
 * @author 【掘金】人人都是程序员
 * @author 【CSDN】人人都是程序员
 * @author 【今日头条】人人都是程序员
 * @author 【官方网站】www.gorhaf.com
 */
public class Main {

    public static void main(String[] args) {
        // 创建任务
        Runnable task1 = new Task();
        Runnable task2 = new Task();
        Runnable task3 = new Task();
        // 创建只有一个线程的线程池
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // 提交任务
        threadPool.execute(task1);
        threadPool.execute(task2);
        threadPool.execute(task3);
        // 关闭线程池
        threadPool.shutdown();
    }
}