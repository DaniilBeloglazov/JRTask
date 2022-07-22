package JavaRush.lvl7task.tsk17;

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
        Map<String,String> map = new HashMap<>(){{
            put("LastName1","name1");
            put("LastName2","name2");
            put("LastName3","name7");
            put("LastName4","name4");
            put("LastName5","name1");
            put("LastName6","name6");
            put("LastName7","name7");
            put("LastName8","name1");
            put("LastName9","name9");
            put("LastName10","name10");
        }};
        Solution.deleteEqualsName(map);
        for (var now : map.keySet()){
            System.out.println(now + " " + map.get(now));
        }
        assertEquals("LastName9 name9\n" +
                "LastName4 name4\n" +
                "LastName10 name10\n" +
                "LastName2 name2\n" +
                "LastName6 name6\n", outContent.toString());
    }
}
