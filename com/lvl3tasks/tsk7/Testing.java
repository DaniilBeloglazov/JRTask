package com.lvl3tasks.tsk7;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    // Создает выходной поток массива байтов , буфер
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        //  System.setOut
    }
    @After
    public void restoreCatsCount() {
        Solution.Cat.catsCount = 0;
    }
    @Test
    public void test1() {
        Solution.Cat.addCats(58);
        System.out.print(Solution.Cat.catsCount);
        assertEquals("58", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.Cat.addCats(34);
        System.out.print(Solution.Cat.catsCount);
        assertEquals("34", outContent.toString());
    }
}