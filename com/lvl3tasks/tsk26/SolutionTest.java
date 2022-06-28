package com.lvl3tasks.tsk26;

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
        System.out.print(Solution.whichDig(3));
        assertEquals("положительное нечетное число", outContent.toString());
    }
    @Test
    public void test2() {
        System.out.print(Solution.whichDig(4));
        assertEquals("положительное четное число", outContent.toString());
    }
    @Test
    public void test3() {
        System.out.print(Solution.whichDig(-3));
        assertEquals("отрицательное нечетное число", outContent.toString());
    }
    @Test
    public void test4() {
        System.out.print(Solution.whichDig(-4));
        assertEquals("отрицательное четное число", outContent.toString());
    }
}
