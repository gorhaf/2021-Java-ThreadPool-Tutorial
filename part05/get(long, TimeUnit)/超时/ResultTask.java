package main;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ResultTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 使当前线程休眠3秒钟
        TimeUnit.SECONDS.sleep(3);
        // 返回1+1的值
        return 1 + 1;
    }
}
