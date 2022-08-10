package RequiredInputOutputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    /**
    *Separator depending on OS
     **/
    private final static String SEPARATOR = System.getProperty("file.separator");
    /**
     *Calculate deep depending on count of dots
     **/
    private static int countDeep(String str) {
        return (int) (str.chars().filter(obj -> obj == '.').count());
    }
    /**
     *Gets name from name containig info about deep
     **/
    private static String getName(String str) {
        return str.replaceAll("\\.", "");
    }
    /**
     *Trims pathDir depending on last and current deep
     **/
    private static void customTrim(StringBuilder pathDir, int lastDeep, String dirWithDots) {
        for (int i = 0; i <= lastDeep - countDeep(dirWithDots); i++) {
            pathDir.delete(pathDir.lastIndexOf(SEPARATOR), pathDir.length());
        }
    }
    /**
     *Adding dir into pathDir with Separator
     **/
    private static void addDirWithSep(StringBuilder pathDir, String dirWithDots) {
        pathDir.append(SEPARATOR).append(getName(dirWithDots));
    }
    /**
     *Instantly creating dirs depending on entering pathDir
     **/
    private static void createDirs(StringBuilder pathDir) {
        new File(pathDir.toString()).mkdirs();
    }
    /**
     * Creates file system from an incoming hierarchy(dots type)
     * @param filename
     * A file with hierarchy of dirs with dots
     * @param pathWhereCreate
     * Path where to create file system
     **/
    public static void createFileSystem(String filename, String pathWhereCreate) {
        try {
            Scanner console = new Scanner(new FileInputStream(filename));
            ArrayList<String> hierarchy = new ArrayList<>();
            while (console.hasNext()) {
                hierarchy.add(console.nextLine());
            }
            StringBuilder pathDir = new StringBuilder(pathWhereCreate);
            int lastDeep = 0;
            for (String s : hierarchy) {
                if (countDeep(s) <= lastDeep) {
                    createDirs(pathDir);
                    customTrim(pathDir, lastDeep, s);
                }
                lastDeep = countDeep(s);
                addDirWithSep(pathDir, s);
            }
            createDirs(pathDir);
            System.out.println("File system was created");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String currentPath = "White/RequiredInputOutputStream";
        createFileSystem("main.txt", currentPath);
    }

}
