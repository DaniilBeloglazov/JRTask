package JavaRush.lvl7task.tsk6;

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
        HashMap<String, Object> map = new HashMap<>(){{
            put("int", 1);
            put("String", "sadprl");
            put("int[]", new int[]{1, 2, 3, 4});
            put("double", 3.14);
            put("char", 'C');
        }};
        Solution.printObj(map);
        assertEquals("3.14\n" +
                "C\n" +
                "1 2 3 4 \n" +
                "sadprl\n" +
                "1\n", outContent.toString());
    }
}