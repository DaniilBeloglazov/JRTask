package com.lvl3tasks.tsk4;
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
        Solution.addNewCat();
        assertEquals("1\n", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.addNewCat();
        assertEquals("2\n", outContent.toString());
    }
}