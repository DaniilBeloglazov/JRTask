package JavaRush.lvl9tasks.tsk15;

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
        ArrayList<String>[] arr = new ArrayList[]{
                new ArrayList<>() {{
                    add("1");
                    add("5");
                    add("6");
                }},
                new ArrayList<>() {{
                    add("3");
                    add("4");
                    add("8");
                }},
                new ArrayList<>() {{
                    add("6");
                    add("5");
                    add("3");
                }}
        };
        Solution.printCasList(arr);
        assertEquals("1 5 6 \n" +
                "3 4 8 \n" +
                "6 5 3 \n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String>[] arr = new ArrayList[]{
                new ArrayList<>() {{
                    add("1");
                    add("5");
                    add("7");
                    add("6");
                }},
                new ArrayList<>() {{
                    add("3");
                    add("2");
                    add("2");
                }},
                new ArrayList<>() {{
                    add("6");
                    add("5");
                    add("3");
                    add("8");
                    add("9");
                }}
        };
        Solution.printCasList(arr);
        assertEquals("1 5 7 6 \n" +
                "3 2 2 \n" +
                "6 5 3 8 9 \n", outContent.toString());
    }
}
