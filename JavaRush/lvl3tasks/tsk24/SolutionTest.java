package JavaRush.lvl3tasks.tsk24;

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
        System.out.print(Solution.getDiffNum(1,4,4));
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test2() {
        System.out.print(Solution.getDiffNum(4,4,1));
        assertEquals("3", outContent.toString());
    }
    @Test
    public void test3() {
        System.out.print(Solution.getDiffNum(4,1,4));
        assertEquals("2", outContent.toString());
    }
    @Test
    public void test4() {
        System.out.print(Solution.getDiffNum(4,4,4));
        assertEquals("0", outContent.toString());
    }
}