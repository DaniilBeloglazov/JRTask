package com.lvl3tasks.tsk14;

import org.junit.Test;
import org.junit.Before;

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
        Solution.isLeapYear(1700);
        assertEquals("количество дней в году: 365", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.isLeapYear(1600);
        assertEquals("количество дней в году: 366", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.isLeapYear(2100);
        assertEquals("количество дней в году: 365", outContent.toString());
    }
}