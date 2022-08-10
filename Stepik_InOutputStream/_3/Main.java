package Stepik_InOutputStream._3;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("task3.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] array = new char[1024];
            int count = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(array);
                count = reader.read(array, 0, count);
            }
            Arrays.stream(result.toString().split(" "))
                    .filter(obj -> obj.startsWith("А"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
