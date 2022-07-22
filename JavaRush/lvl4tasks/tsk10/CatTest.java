package JavaRush.lvl4tasks.tsk10;

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
        Cat cat = new Cat("Finc");
        System.out.print(cat.name + cat.age + cat.color + cat.weight + cat.address);
        assertEquals("Finc5white2null", outContent.toString());
    }
    @Test
    public void test2(){
        Cat cat = new Cat("Finc",12);
        System.out.print(cat.name + cat.age + cat.color + cat.weight + cat.address);
        assertEquals("Finc12white5null", outContent.toString());
    }
    @Test
    public void test3(){
        Cat cat = new Cat("Finc",12,5);
        System.out.print(cat.name + cat.age + cat.color + cat.weight + cat.address);
        assertEquals("Finc5white12null", outContent.toString());
    }
    @Test
    public void test4(){
        Cat cat = new Cat(14,"gray");
        System.out.print(cat.name + cat.age + cat.color + cat.weight + cat.address);
        assertEquals("null5gray14null", outContent.toString());
    }
    @Test
    public void test5(){
        Cat cat = new Cat(15,"green","Wall Street 9");
        System.out.print(cat.name + cat.age + cat.color + cat.weight + cat.address);
        assertEquals("null5green15Wall Street 9", outContent.toString());
    }
}