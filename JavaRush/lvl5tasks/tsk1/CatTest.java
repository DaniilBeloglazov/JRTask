package JavaRush.lvl5tasks.tsk1;

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
    public void test1() throws Throwable {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat2.finalize();
        System.out.print(Cat.catCount);
        assertEquals("2", outContent.toString());
        cat.finalize();
        cat3.finalize();
    }
    @Test
    public void test2() throws Throwable {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        cat.finalize();
        cat2.finalize();
        System.out.print(Cat.catCount);
        assertEquals("0", outContent.toString());
    }
}