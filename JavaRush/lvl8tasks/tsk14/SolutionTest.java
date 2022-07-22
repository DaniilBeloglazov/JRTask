package JavaRush.lvl8tasks.tsk14;

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
        try{
            Solution.method1();
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals("", outContent.toString());
    }
}