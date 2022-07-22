package JavaRush.lvl5tasks.tsk22;

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
        Solution.printInIncrease5(4,6,2,4,9);
        assertEquals("2 4 4 6 9 ", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printInIncrease5(4,6,2,-4,9);
        assertEquals("-4 2 4 6 9 ", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.printInIncrease5(-4,6,-2,4,-9);
        assertEquals("-9 -4 -2 4 6 ", outContent.toString());
    }
}