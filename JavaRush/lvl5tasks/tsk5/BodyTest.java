package JavaRush.lvl5tasks.tsk5;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class BodyTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Body man = new Body(68.4,1.77);
        man.printBMI();
        assertEquals("Нормальный между 18.5 и 24.9", outContent.toString());
    }
    @Test
    public void test2(){
        Body man = new Body(53.4,1.77);
        man.printBMI();
        assertEquals("Недовес, меньше чем 18.5", outContent.toString());
    }
    @Test
    public void test3(){
        Body man = new Body(87.3,1.77);
        man.printBMI();
        assertEquals("Избыточный вес: между 25 и 29.9", outContent.toString());
    }
    @Test
    public void test4(){
        Body man = new Body(100.8,1.77);
        man.printBMI();
        assertEquals("Ожирение: 30 или больше", outContent.toString());
    }
}