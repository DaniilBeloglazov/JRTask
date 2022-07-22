package JavaRush.lvl6tasks.tsk17;

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
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
            add("k");
            add("l");
        }};
        Solution.doubleValues(arr);
        assertEquals("a\n" +
                "a\n" +
                "b\n" +
                "b\n" +
                "c\n" +
                "c\n" +
                "d\n" +
                "d\n" +
                "e\n" +
                "e\n" +
                "f\n" +
                "f\n" +
                "g\n" +
                "g\n" +
                "h\n" +
                "h\n" +
                "k\n" +
                "k\n" +
                "l\n" +
                "l\n", outContent.toString());
    }
}