package JavaRush.lvl7task.tsk11;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print(Solution.getListForRemove().getClass());
        assertEquals("class java.util.LinkedList", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(Solution.getListForGet().getClass());
        assertEquals("class java.util.ArrayList", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(Solution.getListForAddOrInsert().getClass());
        assertEquals("class java.util.LinkedList", outContent.toString());
    }
    @Test
    public void test4(){
        System.out.print(Solution.getListForSet().getClass());
        assertEquals("class java.util.ArrayList", outContent.toString());
    }
}