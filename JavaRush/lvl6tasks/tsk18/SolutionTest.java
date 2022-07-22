package JavaRush.lvl6tasks.tsk18;

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
            add("a");
            add("as");
            add("asd");
            add("adsf");
            add("asdfg");
            add("asdfgh");
            add("asdfghj");
            add("asdfghj");
            add("asdfghjk");
            add("asdfghjk");
        }};
        Solution.isSortedLength(arr);
        assertEquals("", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("a");
            add("as");
            add("asd");
            add("adsf");
            add("asdfg");
            add("asdfgh");
            add("asdfghj");
            add("asdfghj");
            add("asdfghjkf");
            add("asdfghjk");
        }};
        Solution.isSortedLength(arr);
        assertEquals("9\n", outContent.toString());
    }
}