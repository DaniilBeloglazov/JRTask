package Multithreading._4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(4000);
                return "John";
            }
        });
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 22;
            }
        });
        try {
            String name = futureName.get();
            Integer age = futureAge.get();
            System.out.println(name + " " + age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
