package JavaRush.lvl6tasks.tsk5;

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
        int[] arr20 = new int[]{23,23,23,4,2,13,4521,3,421,32,41,23,5,412,31,234,214,12,5,3};
        int[] arr = new int[10];
        arr = Arrays.copyOfRange(arr20, arr20.length / 2, arr20.length);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("41\n23\n5\n412\n31\n234\n214\n12\n5\n3\n", outContent.toString());
    }
    @Test
    public void test2(){
        int[] arr20 = new int[]{23,23,23,4,2,13,4521,3,421,32,1,1,1,1,1,1,1,1,1,1};
        int[] arr = new int[10];
        arr = Arrays.copyOfRange(arr20, arr20.length / 2, arr20.length);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n", outContent.toString());
    }
}