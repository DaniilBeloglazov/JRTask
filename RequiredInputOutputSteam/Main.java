package RequiredInputOutputSteam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("main.txt")) {
            byte[] array = new byte[1024];
            int count = inputStream.read(array);
            StringBuilder builder = new StringBuilder();
            while (count > 0) {
                builder.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            String[] hierarchy = builder.toString().split("\n");
            String currentPath = Paths.get("").toAbsolutePath().toString() + "/";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createDirs(String[] hierarchy, String currentPath){
        StringBuilder pathDir = new StringBuilder(currentPath);
        int lastDeep = 1;
        for (int i = 0; i < hierarchy.length; i++){
            int currDeep = hierarchy[i].replaceAll("[^.]", "").length();
        }
    }
}
