package JavaRush.lvl4tasks.tsk13;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class RectangleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Rectangle rec = new Rectangle(2,4);
        System.out.print(Rectangle.top + "" + Rectangle.left + "" + Rectangle.width + "" + Rectangle.height);
        assertEquals("4200", outContent.toString());
    }
    @Test
    public void test2(){
        Rectangle rec = new Rectangle(2,4, 5);
        System.out.print(Rectangle.top + "" + Rectangle.left + "" + Rectangle.width + "" + Rectangle.height);
        assertEquals("4255", outContent.toString());
    }
    @Test
    public void test3(){
        Rectangle rec = new Rectangle(2,4,6,7);
        System.out.print(Rectangle.top + "" + Rectangle.left + "" + Rectangle.width + "" + Rectangle.height);
        assertEquals("4267", outContent.toString());
    }
    @Test
    public void test4(){
        Rectangle rec1 = new Rectangle(4,6,7,8);
        Rectangle rec = new Rectangle(rec1);
        System.out.print(Rectangle.top + "" + Rectangle.left + "" + Rectangle.width + "" + Rectangle.height);
        assertEquals("6478", outContent.toString());
    }
}