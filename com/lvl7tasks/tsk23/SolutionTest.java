package com.lvl7tasks.tsk23;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        String s = "mama mila ramu";
        Solution.toUpperCFirstLet(s);
        assertEquals("Mama Mila Ramu", outContent.toString());
    }
}