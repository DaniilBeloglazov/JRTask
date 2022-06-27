package com.lvl3tasks.tsk24;

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
        Solution.printDiffNum(1,4,4);
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printDiffNum(4,4,1);
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printDiffNum(4,1,4);
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.printDiffNum(4,4,4);
        assertEquals("", outContent.toString());
    }
}