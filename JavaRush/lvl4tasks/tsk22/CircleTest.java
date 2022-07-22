package JavaRush.lvl4tasks.tsk22;

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
        Circle circ = new Circle();
        circ.printData();
        assertEquals("5.0 5.0 10.0", outContent.toString());
    }
    @Test
    public void test2(){
        Circle circ = new Circle(3.7,8.6);
        circ.printData();
        assertEquals("3.7 8.6 10.0", outContent.toString());
    }
    @Test
    public void test3(){
        Circle circ = new Circle(3.7);
        circ.printData();
        assertEquals("3.7 0.0 10.0", outContent.toString());
    }
}