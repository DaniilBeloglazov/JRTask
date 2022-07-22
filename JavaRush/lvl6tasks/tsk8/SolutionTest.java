package JavaRush.lvl6tasks.tsk8;

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
            add("asd");
            add("asdd");
            add("sdd");
            add("sdaf");
            add("safw");
        }};
        Solution.maxLengthInArr(arr);
        assertEquals("asdd\nsdaf\nsafw\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asdd");
            add("asdd");
            add("sddd");
            add("sdaf");
            add("safw");
        }};
        Solution.maxLengthInArr(arr);
        assertEquals("asdd\nasdd\nsddd\nsdaf\nsafw\n", outContent.toString());
    }
    @Test
    public void test3(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("asdd");
            add("sdd");
            add("sdaf");
            add("safws");
        }};
        Solution.maxLengthInArr(arr);
        assertEquals("safws\n", outContent.toString());
    }
}