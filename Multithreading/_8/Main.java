package Multithreading._8;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    volatile static ArrayList<Integer> arr = new ArrayList<>();
    static Boolean sorted = false;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.add(console.nextInt());
        }
        Object MONITOR = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    System.out.println("findMin got MONITOR");
                    try {
                        while (!sorted) {
                            System.out.println("Waiting");
                            MONITOR.wait();
                        }
                        System.out.println("Finish wait");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Max: " + arr.get(0));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    System.out.println("findMax got MONITOR");
                    arr.sort(Comparator.naturalOrder());
                    sorted = true;
                    MONITOR.notifyAll();
                }
                System.out.println("Max: " + arr.get(arr.size() - 1));
            }
        }).start();
    }
}
