package com.lvl3tasks.tsk15;

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
        Solution.isTriangleExist(1, 2, 3);
        assertEquals("Треугольник не существует.", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.isTriangleExist(2, 2, 3);
        assertEquals("Треугольник существует.", outContent.toString());
    }
}