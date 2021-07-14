package main;

import java.time.LocalTime;
import java.util.concurrent.Callable;

public class ResultTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return LocalTime.now().toString();
    }
}