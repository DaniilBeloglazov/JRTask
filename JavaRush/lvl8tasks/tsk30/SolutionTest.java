package JavaRush.lvl8tasks.tsk30;

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
        ArrayList types = new ArrayList<>(){{
            add("String");
            add("int");
            add("int");
            add("String");
            add("int");
        }};
        ArrayList<String> strings = new ArrayList<>(){{
            add("Вишня");
            add("Буква");
        }};
        ArrayList<Integer> ints = new ArrayList<>(){{
            add(5);
            add(6);
            add(2);
        }};
        Solution.printSortCasual(types, strings, ints);
        assertEquals("Буква\n" +
                "6\n" +
                "5\n" +
                "Вишня\n" +
                "2\n", outContent.toString());
    }
}