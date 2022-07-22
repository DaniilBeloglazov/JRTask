package JavaRush.lvl9tasks.tsk16;

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
        Map<String, Integer> map = new HashMap<>();
        String[] in = {"стол","стул","огонь","рак","стул","стул","вещь","люстра","огонь","надрез","порез","рука","стандарт","вещь","лук","перец","стоп","начало","орк","орк"};
        Solution.printMap(map, in);
        assertEquals("стол 1\n" +
                "начало 1\n" +
                "лук 1\n" +
                "стул 3\n" +
                "рука 1\n" +
                "орк 2\n" +
                "стандарт 1\n" +
                "порез 1\n" +
                "перец 1\n" +
                "надрез 1\n" +
                "огонь 2\n" +
                "рак 1\n" +
                "люстра 1\n" +
                "стоп 1\n" +
                "вещь 2\n", outContent.toString());
    }
}
