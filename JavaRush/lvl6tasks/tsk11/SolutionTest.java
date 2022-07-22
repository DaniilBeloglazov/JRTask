package JavaRush.lvl6tasks.tsk11;

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
        ArrayList<String> arr = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
        }};
        Solution.swap1stNLast13Times(arr);
        assertEquals("3\n4\n5\n1\n2\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("asd2");
            add("asd3");
            add("asd4");
            add("asd5");
        }};
        Solution.swap1stNLast13Times(arr);
        assertEquals("asd3\nasd4\nasd5\nasd\nasd2\n", outContent.toString());
    }
}