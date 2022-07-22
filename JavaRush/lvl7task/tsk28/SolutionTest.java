package JavaRush.lvl7task.tsk28;

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
        Solution.whichMonth(1);
        assertEquals("January is 1 month", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.whichMonth(6);
        assertEquals("June is 6 month", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.whichMonth(12);
        assertEquals("December is 12 month", outContent.toString());
    }
}