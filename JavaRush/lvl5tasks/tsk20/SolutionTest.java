package JavaRush.lvl5tasks.tsk20;

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
    public void test1(){
        int a = 3, b = 4;
        int res = a > b ? a : b;
        System.out.print("Max is: " + res);
        assertEquals("Max is: 4", outContent.toString());
    }
    @Test
    public void test2(){
        int a = -2, b = 5;
        int res = a > b ? a : b;
        System.out.print("Max is: " + res);
        assertEquals("Max is: 5", outContent.toString());
    }
    @Test
    public void test3(){
        int a = -2, b = -5;
        int res = a > b ? a : b;
        System.out.print("Max is: " + res);
        assertEquals("Max is: -2", outContent.toString());
    }
}