package Stepik_InOutputStream._1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "dir1/dir2/dir3";
        File dirs = new File(path);
        File file1 = new File(path + "/file1.txt");
        File file2 = new File(path + "/answer.txt");
        File file3 = new File(path + "/alpha.txt");
        try {
            dirs.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        File[] files = dirs.listFiles(((dir, name) -> name.startsWith("a")));
        Arrays.stream(files).forEach(obj -> System.out.println(obj.getAbsolutePath()    ));
    }
}
