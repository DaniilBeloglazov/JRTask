package JavaRush.lvl5tasks.tsk11;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class StringHelperTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print (StringHelper.multiply("HI"));
        assertEquals("HIHIHIHIHI", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print (StringHelper.multiply("HI",7));
        assertEquals("HIHIHIHIHIHIHI", outContent.toString());
    }
}