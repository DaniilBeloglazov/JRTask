package JavaRush.lvl7task.tsk2;

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
            put("арбуз", "ягода");
            put("банан", "трава");
            put("вишня", "ягода");
            put("груша","фрукт");
            put("дыня","овощ");
            put("ежевика","куст");
            put("жень-шень","корень");
            put("земляника","ягода");
            put("ирис","цветок");
            put("картофель","клубень");
        }};
        Solution.printT(map);
                assertEquals("дыня - овощ\n" +
                        "ежевика - куст\n" +
                        "банан - трава\n" +
                        "арбуз - ягода\n" +
                        "груша - фрукт\n" +
                        "картофель - клубень\n" +
                        "земляника - ягода\n" +
                        "ирис - цветок\n" +
                        "вишня - ягода\n" +
                        "жень-шень - корень\n", outContent.toString());
    }
}