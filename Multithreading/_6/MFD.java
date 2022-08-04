package Multithreading._6;

public class MFD {
    private static final Object MONITOR1 = new Object();
    private static final Object MONITOR2 = new Object();

    public void print(int pageCount) {
        synchronized (MONITOR1) {
            try {
                for (int i = 0; i < pageCount; i++) {
                    Thread.sleep(3000);
                    System.out.println("Printed page number " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void scan(int pageCount) {
        synchronized (MONITOR2) {
            try {
                for (int i = 0; i < pageCount; i++) {
                    Thread.sleep(1000);
                    System.out.println("Scanned page number " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
