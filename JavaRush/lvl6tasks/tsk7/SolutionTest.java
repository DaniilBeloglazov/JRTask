package JavaRush.lvl6tasks.tsk7;

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
            add("HI");
            add("Hola");
            add("Z");
            add("X");
            add("C");
        }};
        System.out.println("Size: " + arr.size());
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("Size: 5\nHI\nHola\nZ\nX\nC\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("He");
            add("She");
            add("It");
            add("His");
            add("Her");
        }};
        System.out.println("Size: " + arr.size());
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("Size: 5\nHe\nShe\nIt\nHis\nHer\n", outContent.toString());
    }
}