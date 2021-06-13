package main;

import java.util.concurrent.Callable;

public class ResultTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 1 + 1;
    }
}
