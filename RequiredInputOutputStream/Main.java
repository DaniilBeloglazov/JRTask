package RequiredInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    /**
    *Separator depending on OS
     **/
    private final static String SEPARATOR = System.getProperty("file.separator");
    /**
     *Calculate deep depending on count of dots
     **/
    private static long countDeep(String str) {
        return str.chars().filter(obj -> obj == '.').count();
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
    private static void createDirsNow(StringBuilder pathDir) {
        new File(pathDir.toString()).mkdirs();
    }
    /**
     * Creates file system from an incoming hierarchy(dots type)
     * @param hierarchy
     * A hierarchy of dirs with dots
     * @param pathWhereCreate
     * Path where to create file system
     **/
    public static void createDirs(String[] hierarchy, String pathWhereCreate) {
        StringBuilder pathDir = new StringBuilder(pathWhereCreate);
        int lastDeep = 0;
        for (int i = 0; i < hierarchy.length; i++) {
            if (countDeep(hierarchy[i]) == lastDeep) {
                //System.out.println(pathDir);
                createDirsNow(pathDir);
                customTrim(pathDir, lastDeep, hierarchy[i]);
                lastDeep = (int) countDeep(hierarchy[i]);
                addDirWithSep(pathDir, hierarchy[i]);
                continue;
            }
            if (countDeep(hierarchy[i]) > lastDeep) {
                addDirWithSep(pathDir, hierarchy[i]);
                lastDeep = (int) countDeep(hierarchy[i]);
                continue;
            }
            if (countDeep(hierarchy[i]) < lastDeep) {
                //System.out.println(pathDir);
                createDirsNow(pathDir);
                customTrim(pathDir, lastDeep, hierarchy[i]);
                addDirWithSep(pathDir, hierarchy[i]);
                lastDeep = (int) countDeep(hierarchy[i]);
            }
        }
        //System.out.println(pathDir);
        createDirsNow(pathDir);
    }

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("main.txt")) {
            byte[] array = new byte[1024];
            int count = inputStream.read(array);
            StringBuilder builder = new StringBuilder();
            while (count > 0) {
                builder.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            String[] hierarchy = builder.toString().replaceAll("\r", "").split("\n");
            String currentPath = "White/RequiredInputOutputStream";
            createDirs(hierarchy, currentPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
