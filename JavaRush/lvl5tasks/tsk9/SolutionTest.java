package JavaRush.lvl5tasks.tsk9;

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
        double res = Solution.getDistance(2 ,1, 4, 3);
        System.out.printf("%.2f", res);
        assertEquals("2.83", outContent.toString());
    }
    @Test
    public void test2(){
        double res = Solution.getDistance(2 ,3, 4, 3);
        System.out.printf("%.2f", res);
        assertEquals("2.00", outContent.toString());
    }
    @Test
    public void test3(){
        double res = Solution.getDistance(4 ,3, 2, 3);
        System.out.printf("%.2f", res);
        assertEquals("2.00", outContent.toString());
    }
}