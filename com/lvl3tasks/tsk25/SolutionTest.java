package com.lvl3tasks.tsk25;

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
    public void test1() {
        Solution.whichQuater(4 ,6);
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.whichQuater(-6 ,-6);
        assertEquals("3", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.whichQuater(4 ,-6);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.whichQuater(-4 ,6);
        assertEquals("2", outContent.toString());
    }
}