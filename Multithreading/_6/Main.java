package Multithreading._6;

public class Main {
    public static void main(String[] args) {
        MFD mfd = new MFD();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfd.print(5);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfd.print(5);
            }
        }).start();
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Check");
            }
        };
    }
}
