package JavaRush.lvl8tasks.tsk6;

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
        Solution.log("In test1");
        assertEquals("com.lvl8tasks.tsk6.SolutionTest: test1: In test1", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.log("In test2");
        assertEquals("com.lvl8tasks.tsk6.SolutionTest: test2: In test2", outContent.toString());
    }
}