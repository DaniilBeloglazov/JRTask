package Multithreading._3;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        long before = System.currentTimeMillis();
        service.execute(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 1_000_000; i++) {
                    if (i % 2 == 0)
                        sum += i;
                }
                System.out.println("Sum of even: " + sum);
                countDownLatch.countDown();
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i <= 1_000_000; i++) {
                    if (i % 7 == 0)
                        sum += i;
                }
                System.out.println("Sum of Div 7 Without reminder: " + sum);
                countDownLatch.countDown();
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                ArrayList<Integer> coll = new ArrayList<>(1000);
                for (int i = 0; i < 1000; i++) {
                    int rand = (int) (Math.random() * 1000);
                    if (rand % 2 == 0)
                        sum += 1;
                    coll.add(rand);
                }
                System.out.println("Count of even numbers in collection: " + sum);
                countDownLatch.countDown();
            }
        });
        service.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println("Millis: " + (after - before));
    }
}
