package com.lvl3tasks.tsk20;

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
        Solution.printInDecrease(23,12,42);
        assertEquals("42 23 12 ", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printInDecrease(12,12,42);
        assertEquals("42 12 12 ", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printInDecrease(23,42,12);
        assertEquals("42 23 12 ", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.printInDecrease(23,23,23);
        assertEquals("23 23 23 ", outContent.toString());
    }
}