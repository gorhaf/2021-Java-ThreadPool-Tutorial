package main;

import java.util.concurrent.*;

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
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        // 创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 25, 10L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new CustomThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        // 提交任务
        threadPool.execute(task1);
        threadPool.execute(task2);
        threadPool.execute(task3);
        // 关闭线程池
        threadPool.shutdown();
    }
}