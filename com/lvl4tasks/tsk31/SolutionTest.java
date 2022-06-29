package com.lvl4tasks.tsk31;

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
        Solution.printMinOf5(4,6,2,9,13);
        assertEquals("2", outContent.toString());
    }

    @Test
    public void test2(){
        Solution.printMinOf5(2,2,2,2,2);
        assertEquals("2", outContent.toString());
    }

    @Test
    public void test3(){
        Solution.printMinOf5(4,6,-2,9,13);
        assertEquals("-2", outContent.toString());
    }
}