package JavaRush.lvl4tasks.tsk11;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Dog doggo = new Dog("Frank");
        System.out.print(doggo.name + doggo.height + doggo.color);
        assertEquals("Frank60unknown", outContent.toString());
    }
    @Test
    public void test2(){
        Dog doggo = new Dog("Ast",120);
        System.out.print(doggo.name + doggo.height + doggo.color);
        assertEquals("Ast120unknown", outContent.toString());
    }
    @Test
    public void test3(){
        Dog doggo = new Dog("Sanj",80,"blue");
        System.out.print(doggo.name + doggo.height + doggo.color);
        assertEquals("Sanj80blue", outContent.toString());
    }
}