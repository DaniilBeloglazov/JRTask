package com.lvl3tasks.tsk21;

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
        Solution.isEqualNmOrLn("Настя", "Настя");
        assertEquals("Имена идентичны", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.isEqualNmOrLn("Настя", "Наста");
        assertEquals("Длины имен равны", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.isEqualNmOrLn("Настя", "Ксения");
        assertEquals("", outContent.toString());
    }
}