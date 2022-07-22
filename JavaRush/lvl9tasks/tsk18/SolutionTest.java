package JavaRush.lvl9tasks.tsk18;

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
        HashMap<Integer, String> map = new HashMap<>(){{
            put(1,"asd");
            put(2,"asd");
            put(3,"asd");
            put(4,"asd");
            put(5,"asd");
            put(6,"asd");
            put(7,"asd");
        }};
        for (Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        assertEquals("1 asd\n2 asd\n3 asd\n4 asd\n5 asd\n6 asd\n7 asd\n", outContent.toString());
    }
    @Test
    public void test2(){
        HashMap<Integer, String> map = new HashMap<>(){{
            put(1,"asd");
            put(2,"asd");
            put(3,"asdf");
            put(4,"asdg");
            put(5,"asdf");
            put(6,"asd");
            put(7,"asd");
        }};
        for (Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        assertEquals("1 asd\n2 asd\n3 asdf\n4 asdg\n5 asdf\n6 asd\n7 asd\n", outContent.toString());
    }
}
