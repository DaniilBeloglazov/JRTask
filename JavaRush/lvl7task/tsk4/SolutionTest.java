package JavaRush.lvl7task.tsk4;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        HashMap<String, String> map = new HashMap<>(){{
            put("1","asd");
            put("2","asd");
            put("3","asd");
            put("4","asd");
            put("5","asd");
            put("6","asd");
            put("7","asd");
            put("8","asd");
            put("9","asd");
            put("10","asd");
        }};
        Solution.printKeys(map);
        assertEquals("1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n", outContent.toString());
    }
}