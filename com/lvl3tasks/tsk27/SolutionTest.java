package com.lvl3tasks.tsk27;

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
        System.out.print(Solution.getDigitInf(8));
                assertEquals("четное однозначное число", outContent.toString());
    }
    @Test
    public void test2() {
        System.out.print(Solution.getDigitInf(7));
        assertEquals("нечетное однозначное число", outContent.toString());
    }
    @Test
    public void test3() {
        System.out.print(Solution.getDigitInf(84));
        assertEquals("четное двузначное число", outContent.toString());
    }
    @Test
    public void test4() {
        System.out.print(Solution.getDigitInf(73));
        assertEquals("нечетное двузначное число", outContent.toString());
    }
    @Test
    public void test5() {
        System.out.print(Solution.getDigitInf(124));
        assertEquals("четное трехзначное число", outContent.toString());
    }
    @Test
    public void test6() {
        System.out.print(Solution.getDigitInf(123));
        assertEquals("нечетное трехзначное число", outContent.toString());
    }
}