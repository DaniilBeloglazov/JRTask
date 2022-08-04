package Multithreading._5;


public class _5 {
    private static final Object monitor = new Object();
    private static String next = "A";
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        while (!next.equals("A")) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println("A");
                        next = "B";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        while (!next.equals("B")) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println("B");
                        next = "C";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        while (!next.equals("C")) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println("C");
                        next = "A";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();
    }
}
