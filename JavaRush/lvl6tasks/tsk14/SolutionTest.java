package JavaRush.lvl6tasks.tsk14;

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
        Solution.delete3NReversePrint(arr);
        assertEquals("5\n4\n2\n1\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("asdf");
            add("asdfg");
            add("asdfgh");
            add("asdfghe");
        }};
        Solution.delete3NReversePrint(arr);
        assertEquals("asdfghe\nasdfgh\nasdf\nasd\n", outContent.toString());
    }
}