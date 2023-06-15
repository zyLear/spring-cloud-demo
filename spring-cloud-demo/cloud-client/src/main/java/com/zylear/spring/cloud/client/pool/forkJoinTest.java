package com.zylear.spring.cloud.client.pool;

import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

public class forkJoinTest {

    public static void main(String[] args) throws InterruptedException {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long start = System.currentTimeMillis();
//        Integer invoke = forkJoinPool.invoke(new CalculateTask(0, 1000));
//        System.out.println("result: " + invoke);

        MergeTask mergeTask1 = new MergeTask(0, 1000);
        MergeTask mergeTask2 = new MergeTask(1000, 2000);
        forkJoinPool.submit(mergeTask1);
        forkJoinPool.submit(mergeTask2);

        System.out.println(System.currentTimeMillis() - start);
        forkJoinPool.shutdown();
        boolean b = forkJoinPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("main end");
    }

    public static class MergeTask extends RecursiveTask<Integer> {

        private Integer start;
        private Integer end;

        public MergeTask(Integer start, Integer end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {

            Integer result = 0;
            for (int i = start; i <= end; i++) {
                result += i;
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread end");

            return result;
        }
    }

    public static class CalculateTask extends RecursiveTask<Integer> {

        private Integer start;
        private Integer end;

        public CalculateTask(Integer start, Integer end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {

            if (start > end) {
                return 0;
            } else if (start.equals(end)) {
                return start;
            } else {
                int mid = start + (end - start) / 2;
                CalculateTask calculateTask1 = new CalculateTask(start, mid);
                CalculateTask calculateTask2 = new CalculateTask(mid + 1, end);
                calculateTask1.fork();
                calculateTask2.fork();
                return calculateTask1.join() + calculateTask2.join();
            }
        }
    }


}
