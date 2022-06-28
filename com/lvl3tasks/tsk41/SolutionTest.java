package com.lvl3tasks.tsk41;

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
        Solution.printMedOf3(3,4,6);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test2() {
        Solution.printMedOf3(3,6,4);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test3() {
        Solution.printMedOf3(4,3,6);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test4() {
        Solution.printMedOf3(4,3,4);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test5() {
        Solution.printMedOf3(4,4,6);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test6() {
        Solution.printMedOf3(6,4,4);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test7() {
        Solution.printMedOf3(4,4,4);
        assertEquals("4", outContent.toString());
    }
}