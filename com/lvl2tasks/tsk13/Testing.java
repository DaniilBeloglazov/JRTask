package com.lvl2tasks.tsk13;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
public class Testing {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void test1() {
        Solution.main();
        assertEquals("Red Orange Yellow Green Blue Indigo Violet ", outContent.toString());
    }
    @Test
    public void wrongtest1() {
        Solution.main();
        assertEquals("Red Orange Yellow Green Blue Indigo Violett", outContent.toString());
    }
}
