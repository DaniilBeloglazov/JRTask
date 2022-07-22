package JavaRush.lvl6tasks.tsk1;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.initializeArray();
        int[] input = new int[]{2,5,76,7,32,312,3,545,123,2,5,4,324,6,43,23,532,323,5,1};
        Solution.arr = Arrays.copyOf(input,20);
        Solution.printMax(Solution.arr);
        assertEquals("545", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.initializeArray();
        int[] input = new int[]{2,5,763,7,32,312,3,545,123,2,5,4,324,6,43,23,532,323,5,1};
        Solution.arr = Arrays.copyOf(input,20);
        Solution.printMax(Solution.arr);
        assertEquals("763", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.initializeArray();
        int[] input = new int[]{2456,5,76,7,32,312,3,545,123,2,5,4,324,6,43,23,532,323,5,1};
        Solution.arr = Arrays.copyOf(input,20);
        Solution.printMax(Solution.arr);
        assertEquals("2456", outContent.toString());
    }
}