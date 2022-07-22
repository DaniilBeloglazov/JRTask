package JavaRush.lvl6tasks.tsk19;

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
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(0);
        }};
        Solution.printIntDec(arr);
        assertEquals("0\n" +
                "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n", outContent.toString());
    }
}