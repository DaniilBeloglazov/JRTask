package com.lvl3tasks.tsk5;
import org.junit.Test;
import org.junit.Before;
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
        Solution.setCatsCount(245);
        System.out.print(Solution.catsCount);
        assertEquals("245", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.setCatsCount(24235);
        System.out.print(Solution.catsCount);
        assertEquals("24235", outContent.toString());
    }
}
