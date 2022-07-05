package com.lvl8tasks.tsk28;

import java.io.*;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner cons = new Scanner(System.in);

        String sourceFileName = cons.nextLine();
        String destinationFileName = cons.nextLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
