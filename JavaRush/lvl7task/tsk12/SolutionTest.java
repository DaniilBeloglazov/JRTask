package JavaRush.lvl7task.tsk12;

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
        int[] arr = {1,2,2,3,3,3,4,5,6,9};
        Solution.checkMaxLenSubseq(arr);
        assertEquals("3", outContent.toString());
    }
    @Test
    public void test2(){
        int[] arr = {1,2,2,3,3,3,9,9,9,9};
        Solution.checkMaxLenSubseq(arr);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test3(){
        int[] arr = {2,2,2,2,2,3,9,9,9,9};
        Solution.checkMaxLenSubseq(arr);
        assertEquals("5", outContent.toString());
    }
}