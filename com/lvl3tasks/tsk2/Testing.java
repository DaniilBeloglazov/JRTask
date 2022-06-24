package com.lvl3tasks.tsk2;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test1() {
        Solution.addPrice(25);
        assertEquals("25", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.addPrice(45);
        assertEquals("70", outContent.toString());
    }
}