package JavaRush.lvl5tasks.tsk12;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class CalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        System.out.print(Calculator.plus(4,5));
        assertEquals("9", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(Calculator.minus(4,5));
        assertEquals("-1", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(Calculator.multiply(4,5));
        assertEquals("20", outContent.toString());
    }
    @Test
    public void test4(){
        System.out.print(Calculator.division(4,5));
        assertEquals("0.8", outContent.toString());
    }
    @Test
    public void test5(){
        System.out.print(Calculator.percent(4,80));
        assertEquals("3.2", outContent.toString());
    }
}