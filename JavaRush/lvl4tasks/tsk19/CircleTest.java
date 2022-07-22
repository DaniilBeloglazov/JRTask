package JavaRush.lvl4tasks.tsk19;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


 public class CircleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Circle circ = new Circle(4,5,6);
        circ.printData();
        assertEquals("4 5 6 0 null", outContent.toString());
    }
    @Test
    public void test2(){
        Circle circ = new Circle(4,5,6,5);
        circ.printData();
        assertEquals("4 5 6 5 null", outContent.toString());
    }
    @Test
    public void test3(){
        Circle circ = new Circle(4,5,6,5,"Indigo");
        circ.printData();
        assertEquals("4 5 6 5 Indigo", outContent.toString());
    }
}