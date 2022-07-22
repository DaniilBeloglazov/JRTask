package JavaRush.lvl3tasks.tsk23;

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
        Solution.checkAge(32);
        assertEquals("И 18-ти достаточно", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.checkAge(20);
        assertEquals("", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.checkAge(21);
        assertEquals("И 18-ти достаточно", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.checkAge(17);
        assertEquals("", outContent.toString());
    }
}