package JavaRush.lvl3tasks.tsk19;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent= new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() {
        Solution.printMaxof4(1,2,3,4);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printMaxof4(1,4,3,2);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printMaxof4(4,2,3,1);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.printMaxof4(4,4,34,4);
        assertEquals("34", outContent.toString());
    }
    @Test
    public void test6() {
        Solution.printMaxof4(1,2,23,4);
        assertEquals("23", outContent.toString());
    }
}