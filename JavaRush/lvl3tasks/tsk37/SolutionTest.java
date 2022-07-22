package JavaRush.lvl3tasks.tsk37;

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
        Solution.printTriangle8();
        assertEquals("8\n" +
                "88\n" +
                "888\n" +
                "8888\n" +
                "88888\n" +
                "888888\n" +
                "8888888\n" +
                "88888888\n" +
                "888888888\n" +
                "8888888888\n", outContent.toString());
    }
}