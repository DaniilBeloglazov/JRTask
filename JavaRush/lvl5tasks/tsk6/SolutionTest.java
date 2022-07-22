package JavaRush.lvl5tasks.tsk6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static JavaRush.lvl5tasks.tsk6.Solution.even;
import static JavaRush.lvl5tasks.tsk6.Solution.odd;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void restoreStatic(){
        even = 0;
        odd = 0;
    }
    @Test
    public void test1(){
        Solution.printHowMuchEvenNOdd(1456);
        assertEquals("Even: 2 Odd: 2", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printHowMuchEvenNOdd(4468);
        assertEquals("Even: 4 Odd: 0", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.printHowMuchEvenNOdd(3333);
        assertEquals("Even: 0 Odd: 4", outContent.toString());
    }
}