package com.lvl3tasks.tsk29;

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
        Solution.printCountOfPosNNeg(2,5,6);
        assertEquals("количество отрицательных чисел: 0\n" +
            "количество положительных чисел: 3", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printCountOfPosNNeg(-2,-5,-6);
        assertEquals("количество отрицательных чисел: 3\n" +
                "количество положительных чисел: 0", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printCountOfPosNNeg(-2,5,6);
        assertEquals("количество отрицательных чисел: 1\n" +
                "количество положительных чисел: 2", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.printCountOfPosNNeg(2,-5,-6);
        assertEquals("количество отрицательных чисел: 2\n" +
                "количество положительных чисел: 1", outContent.toString());
    }
}