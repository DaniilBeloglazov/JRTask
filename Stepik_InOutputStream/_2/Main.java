package Stepik_InOutputStream._2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        File dir = new File("myTask");
        File file = new File("myTask/task.txt");
        try{
            dir.mkdir();
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        try(InputStream inputStream = new FileInputStream("myTask/task.txt")){
            int a = inputStream.read();
            while (a != -1){
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
