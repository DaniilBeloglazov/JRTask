package Multithreading._9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SaveAsThread extends Thread {
    private String fileName;
    private char[] arr;

    public SaveAsThread(String fileName, char[] arr) {
        this.fileName = fileName;
        this.arr = arr;
    }

    @Override
    public void run() {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            OutputStream outputStream = new FileOutputStream(file);
            for (var now : arr){
                outputStream.write(String.valueOf(now).getBytes(StandardCharsets.UTF_8));
            }
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
