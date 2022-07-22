package JavaRush.lvl3tasks.tsk8;

import org.junit.Before;
import org.junit.Test;
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
        Solution.compare(12);
        assertEquals("Число больше 5",outContent.toString());
    }
    @Test
    public void test2(){
        Solution.compare(1);
        assertEquals("Число меньше 5",outContent.toString());
    }
    @Test
    public void test3(){
        Solution.compare(5);
        assertEquals("Число равно 5",outContent.toString());
    }
}