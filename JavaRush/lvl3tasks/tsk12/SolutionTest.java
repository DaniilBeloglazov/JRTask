package JavaRush.lvl3tasks.tsk12;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.changenPrint(5);
        assertEquals("10", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.changenPrint(0);
        assertEquals("0", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.changenPrint(-4);
        assertEquals("-3", outContent.toString());
    }
}