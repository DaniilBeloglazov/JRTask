package Multithreading._1;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        withConcurrency();
        withoutConcurrency();
    }

    private static final int SIZE = 10_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    public static void withoutConcurrency() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long before = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long after = System.currentTimeMillis();
        System.out.println("WITHOUT: " + (after - before));
    }

    public static void withConcurrency() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long before = System.currentTimeMillis();
        float[] arr1 = new float[HALF_SIZE];
        float[] arr2 = new float[HALF_SIZE];
        System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, arr1, 0, HALF_SIZE);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < HALF_SIZE; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < HALF_SIZE; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);
        long after = System.currentTimeMillis();
        System.out.println("WITH: " + (after - before));
    }
}
