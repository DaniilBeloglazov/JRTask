package com.lvl3tasks.tsk22;

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
        Solution.checkAge(32);
        assertEquals("", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.checkAge(17);
        assertEquals("Подрасти еще", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.checkAge(18);
        assertEquals("", outContent.toString());
    }
}