package JavaRush.lvl8tasks.tsk22;

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
        Solution.printDateAfterFormat("08/18/2013");
        assertEquals("AUG 18, 2013", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printDateAfterFormat("12/17/2000");
        assertEquals("DEC 17, 2000", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.printDateAfterFormat("03/13/2018");
        assertEquals("MAR 13, 2018", outContent.toString());
    }
}