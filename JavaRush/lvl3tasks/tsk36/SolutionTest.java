package JavaRush.lvl3tasks.tsk36;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test1() {
        Solution.printRect(2,4);
        assertEquals("8888\n8888\n", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printRect(2,1);
        assertEquals("8\n8\n", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printRect(1,2);
        assertEquals("88\n", outContent.toString());
    }
}