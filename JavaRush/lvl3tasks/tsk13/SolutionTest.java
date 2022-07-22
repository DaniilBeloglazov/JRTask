package JavaRush.lvl3tasks.tsk13;

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
        Solution.printWeekName(1);
        assertEquals("понедельник", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printWeekName(7);
        assertEquals("воскресенье", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printWeekName(8);
        assertEquals("такого дня недели не существует", outContent.toString());
    }
}