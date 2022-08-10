package Stepik_InOutputStream._5;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("task5BigFile.txt", "r")) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter page: ");
            String page = console.nextLine();
            byte[] array = new byte[3000];
            while (!page.equals("Exit")) {
                randomAccessFile.seek((Integer.parseInt(page) - 1) * array.length);
                int count = randomAccessFile.read(array);
                System.out.println(new String(array, 0, count));
                System.out.println("Enter page: ");
                page = console.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
