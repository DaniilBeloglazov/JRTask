package JavaRush.lvl5tasks.tsk13;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
        }
        System.out.print(Cat.catCount);
        assertEquals("10", outContent.toString());
    }
}