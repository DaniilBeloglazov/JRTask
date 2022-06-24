package com.lvl3tasks.tsk9;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.closeToTen(6,8);
        assertEquals("8", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.closeToTen(6,6);
        assertEquals("6", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.closeToTen(8,6);
        assertEquals("8", outContent.toString());
    }
}