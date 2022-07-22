package JavaRush.lvl8tasks.tsk29;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() throws IOException {
        String sourceFileName = "/asd/bger";
        String destinationFileName = "/home/user/Documents/Jrtaskfolder/JrTask/com/lvl8tasks/tsk29/destination.txt";
        InputStream fileInputStream = null;
        try{
            fileInputStream = Solution.getInputStream(sourceFileName);
        } catch (IOException e){
            System.out.println("Файл не существует.");
            sourceFileName = "/home/user/Documents/Jrtaskfolder/JrTask/com/lvl8tasks/tsk29/source.txt";
            fileInputStream = Solution.getInputStream(sourceFileName);
        }
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
        assertEquals("Файл не существует.\nСкопировано байт 11\n", outContent.toString());
    }
}