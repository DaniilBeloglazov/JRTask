package JavaRush.lvl4tasks.tsk32;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        TreeSet<Integer> set = new TreeSet<>(){{
            add(5);
            add(56);
            add(-3);
            add(55);
        }};
        Solution.printMaxOfSet(set);
        assertEquals("56", outContent.toString());
    }
    @Test
    public void test2(){
        TreeSet<Integer> set = new TreeSet<>(){{
            add(5);
            add(5);
            add(-3);
            add(5);
        }};
        Solution.printMaxOfSet(set);
        assertEquals("5", outContent.toString());
    }
    @Test
    public void test3(){
        TreeSet<Integer> set = new TreeSet<>(){{
            add(5);
            add(5);
            add(5);
            add(5);
        }};
        Solution.printMaxOfSet(set);
        assertEquals("5", outContent.toString());
    }
}