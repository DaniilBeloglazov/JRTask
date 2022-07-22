package JavaRush.lvl7task.tsk27;

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
        System.out.print(Solution.booisDateOdd("JANUARY 1 2000"));
        assertEquals("true", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(Solution.booisDateOdd("JANUARY 2 2000"));
        assertEquals("false", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(Solution.booisDateOdd("FEBRUARY 14 2022"));
        assertEquals("true", outContent.toString());
    }
}