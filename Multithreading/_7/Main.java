package Multithreading._7;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    static volatile Long check = 0L;
    public static void main(String[] args) {
        ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10); // no
        CountDownLatch countDownLatch = new CountDownLatch(10); // no
        CyclicBarrier barrier = new CyclicBarrier(10);
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Car car = new Car("Car" + index);
                    long before = System.currentTimeMillis();
                    car.prepare();
                    try {
                        barrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    car.rideRoad();
                    try {
                        semaphore.acquire();
                        car.rideTunnel();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                    car.rideRoad();
                    long after = System.currentTimeMillis();
                    map.put(car.getCarName(), (after - before));
                    countDownLatch.countDown();
                }
            });
        }
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (String carName : map.keySet()){
            System.out.println(carName + " - " + map.get(carName));
        }
    }

}
