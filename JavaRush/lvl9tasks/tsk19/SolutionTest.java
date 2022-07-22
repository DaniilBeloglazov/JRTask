package JavaRush.lvl9tasks.tsk19;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        HashMap<String, Integer> map = new HashMap<>(){{
            put("str1",1);
            put("str2",2);
            put("str3",3);
            put("str4",2);
            put("str5",5);
        }};
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        assertEquals("5 str5\n" +
                "3 str3\n" +
                "2 str4\n" +
                "1 str1\n" +
                "2 str2\n", outContent.toString());
    }
}
