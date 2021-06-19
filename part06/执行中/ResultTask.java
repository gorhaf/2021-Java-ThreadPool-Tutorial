package main;

import java.util.concurrent.Callable;

public class ResultTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 计数器
        int i = 0;
        // 当线程没被中断时
        while (!Thread.interrupted()) {
            // 递增i
            i++;
        }
        // 输出i
        System.out.println(i);
        // 返回1+1的值
        return 1 + 1;
    }
}