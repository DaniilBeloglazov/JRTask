package JavaRush.lvl6tasks.tsk21;

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
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);
            add(123);
            add(123);
            add(142);
            add(5421);
            add(312);
            add(231);
            add(123);
            add(4221);
            add(235);
            add(235);
            add(2353);
            add(234);
            add(5342);
            add(124);
            add(1);
            add(1235);
            add(23);
            add(12);
            add(45);
        }};
        Solution.printMinNMax(arr);
        assertEquals("1\n5421", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);
            add(123);
            add(123);
            add(142);
            add(5421);
            add(312);
            add(1234);
            add(123);
            add(4221);
            add(235);
            add(235);
            add(2353);
            add(234);
            add(5342);
            add(124);
            add(123);
            add(1235);
            add(23);
            add(12);
            add(45);
        }};
        Solution.printMinNMax(arr);
        assertEquals("2\n5421", outContent.toString());
    }
}