package JavaRush.lvl8tasks.tsk29;

import java.io.*;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner cons = new Scanner(System.in);
        String sourceFileName = cons.nextLine();
        String destinationFileName = cons.nextLine();
        InputStream fileInputStream = null;
        try{
            fileInputStream = getInputStream(sourceFileName);
        } catch (IOException e){
            System.out.println("Файл не существует.");
            sourceFileName = cons.nextLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

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
