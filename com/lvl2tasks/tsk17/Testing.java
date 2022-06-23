package com.lvl2tasks.tsk17;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1() {
        Solution.inPS("Вася",100000,5);
        assertEquals("Вася получает 100000 через 5 лет.", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.inPS("Сергей",129504383,12);
        assertEquals("Сергей получает 129504383 через 12 лет.", outContent.toString());
    }
}
