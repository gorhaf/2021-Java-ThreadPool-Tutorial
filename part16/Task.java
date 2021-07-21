package main;

import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<Integer> {
    /**
     * 起始值
     */
    private int start;
    /**
     * 结束值
     */
    private int end;
    /**
     * 临界值
     */
    private int temp = 10;

    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // 当开头与结尾之差小于临界值时
        if ((end - start) < temp) {
            // 记录计算结果
            int sum = 0;
            // 累加开头-结尾的值
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            // 返回结果
            return sum;
        } else {
            // 取中间值
            int middle = (start + end) / 2;
            // 计算开头-中间
            Task task1 = new Task(start, middle);
            // 向线程池中添加此任务
            task1.fork();
            // 计算中间-结尾
            Task task2 = new Task(middle + 1, end);
            // 向线程池中添加此任务
            task2.fork();
            // 合并结果
            return task1.join() + task2.join();
        }
    }
}