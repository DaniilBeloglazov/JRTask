package Stepik_InOutputStream._4;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("4task.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = console.nextLine();
            while (!name.equals("Exit")) {
                outputStream.write(name.getBytes(StandardCharsets.UTF_8));
                outputStream.write("\n".getBytes(StandardCharsets.UTF_8));
                name = console.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] array = new byte[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int count = inputStream.read(array);
            while (count > 0) {
                stringBuilder.append(new String(array, 0 , count));
                count = inputStream.read(array, 0, count);
            }
            System.out.println(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
