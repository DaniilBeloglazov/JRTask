package Multithreading._9;

import java.io.FileInputStream;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        char[] arr = new char[]{93,92,95,97,96};
        SaveAsThread saveAsThread = new SaveAsThread("Testfile.txt", arr);
        saveAsThread.start();
        try {
            saveAsThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            InputStream inputStream = new FileInputStream("Testfile.txt");
            while (inputStream.available() != 0){
                System.out.println(inputStream.read());
            }
            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
