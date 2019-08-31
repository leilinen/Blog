package com.java.threads;

import java.util.concurrent.*;

/***
 * 简单的实现有返回值的线程
 */

public class CallableFuture {

    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //创建三个有返回值的任务
        CallableTest c1 = new CallableTest("线程1");
        CallableTest c2 = new CallableTest("线程2");
        CallableTest c3 = new CallableTest("线程3");

        Future f1 = pool.submit(c1);
        Future f2 = pool.submit(c2);
        Future f3 = pool.submit(c3);

        try {
            System.out.println(f1.get().toString());
            System.out.println(f2.get().toString());
            System.out.println(f3.get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }

    }
}


class CallableTest implements Callable {

    private String name;

    public CallableTest(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        return name + "返回了东西";
    }
}