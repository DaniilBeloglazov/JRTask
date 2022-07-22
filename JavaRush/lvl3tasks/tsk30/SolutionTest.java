package JavaRush.lvl3tasks.tsk30;

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
        Solution.printOneToTen();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n", outContent.toString());
    }
}