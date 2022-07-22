package JavaRush.lvl4tasks.tsk29;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(4);
            add(2);
            add(-3);
        }};
        Solution.printSumOfArr(arr);
        assertEquals("3", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<Integer> arr = new ArrayList<>(){{
        }};
        Solution.printSumOfArr(arr);
        assertEquals("0", outContent.toString());
    }
    @Test
    public void test3(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(4);
        }};
        Solution.printSumOfArr(arr);
        assertEquals("4", outContent.toString());
    }
}