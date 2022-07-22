package JavaRush.lvl3tasks.tsk32;

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
        Solution.printStrNTimes("HI", 5);
        assertEquals("HI\nHI\nHI\nHI\nHI\n", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printStrNTimes("HI", 1);
        assertEquals("HI\n", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printStrNTimes("HI", 0);
        assertEquals("", outContent.toString());
    }
}