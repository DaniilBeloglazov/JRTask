package JavaRush.lvl6tasks.tsk16;

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
            add("привет");
            add("юла");
            add("принт");
            add("слово");
            add("назад");
        }};
        Solution.fix(arr);
        assertEquals("юла\nюла\nслово\nслово\nназад\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("привет");
            add("юла");
            add("принтл");
            add("слово");
            add("назад");
            add("назадлр");
        }};
        Solution.fix(arr);
        assertEquals("юла\nюла\nпринтл\nслово\nслово\nназад\nназадлр\n", outContent.toString());
    }
}