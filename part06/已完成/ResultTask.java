package main;

import java.util.concurrent.Callable;

public class ResultTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 返回1+1的值
        return 1 + 1;
    }
}