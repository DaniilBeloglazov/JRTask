package com.lvl3tasks.tsk17;

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
        Solution.isPareExist(1,2,3);
        assertEquals("", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.isPareExist(4,4,4);
        assertEquals("4 4 4", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.isPareExist(1,1,3);
        assertEquals("1 1", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.isPareExist(1,3,1);
        assertEquals("1 1", outContent.toString());
    }
    @Test
    public void test5() {
        Solution.isPareExist(3,1,1);
        assertEquals("1 1", outContent.toString());
    }
}