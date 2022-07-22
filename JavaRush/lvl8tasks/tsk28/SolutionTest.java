package JavaRush.lvl8tasks.tsk28;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String sourceFileName = "/home/user/Documents/Jrtaskfolder/JrTask/com/lvl8tasks/tsk28/source.txt";
    private String destinationFileName = "/home/user/Documents/Jrtaskfolder/JrTask/com/lvl8tasks/tsk28/destination.txt";
    @Before
    public void setUpStreams() throws FileNotFoundException {
        System.setOut(new PrintStream(outContent));
        File file = new File((destinationFileName));
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }
    @Test
    public void test1() throws IOException {

        InputStream fileInputStream = Solution.getInputStream(sourceFileName);
        OutputStream fileOutputStream = Solution.getOutputStream(destinationFileName);

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
        assertEquals("Скопировано байт 11\n", outContent.toString());
    }
    @Test
    public void test2() throws IOException {

        InputStream fileInputStream = Solution.getInputStream(sourceFileName);
        OutputStream fileOutputStream = Solution.getOutputStream(destinationFileName);

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
        String files = Files.readString(Path.of(sourceFileName));
        String files2 = Files.readString(Path.of(destinationFileName));
        System.out.print(files.equals(files2));
        assertEquals("Скопировано байт 11\ntrue", outContent.toString());
    }
}