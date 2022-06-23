package com.lvl2tasks.tsk18;
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
        Solution.outP("Вася");
        assertEquals("Вася зарабатывает $5,000. Ха-ха-ха!", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.outP("Сергей");
        assertEquals("Сергей зарабатывает $5,000. Ха-ха-ха!", outContent.toString());
    }
}
