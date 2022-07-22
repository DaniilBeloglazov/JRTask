package JavaRush.lvl3tasks.tsk42;

import org.junit.After;
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
    @After
    public void restoreNum() {
        Solution.sum = 1;
    }
    @Test
    public void test1() {
        int[] input = {1, 2, 3, 4, 5, -1};
        for (int i = 0; i < input.length; i++){
            Solution.calcSum(input[i]);
        }
        System.out.print(Solution.sum);
        assertEquals("15", outContent.toString());
    }
    @Test
    public void test2() {
        int[] input = {-1};
        for (int i = 0; i < input.length; i++){
            Solution.calcSum(input[i]);
        }
        System.out.print(Solution.sum);
        assertEquals("0", outContent.toString());
    }
    @Test
    public void test3() {
        int[] input = {2, 4, -1};
        for (int i = 0; i < input.length; i++){
            Solution.calcSum(input[i]);
        }
        System.out.print(Solution.sum);
        assertEquals("6", outContent.toString());
    }
}