package JavaRush.lvl3tasks.tsk16;

import org.junit.Test;
import org.junit.Before;

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
        Solution.printColTrafLight(123);
        assertEquals("желтый", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printColTrafLight(57);
        assertEquals("зеленый", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printColTrafLight(64);
        assertEquals("красный", outContent.toString());
    }
}