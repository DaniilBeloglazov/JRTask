package JavaRush.lvl4tasks.tsk2;

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
        Solution cons = new Solution();
        cons.addPrice(135);
        System.out.print(Solution.applesPrice);
        assertEquals("135", outContent.toString());
    }
    @Test
    public void test2(){
        Solution cons = new Solution();
        cons.addPrice(200);
        System.out.print(Solution.applesPrice);
        assertEquals("335", outContent.toString());
    }
}