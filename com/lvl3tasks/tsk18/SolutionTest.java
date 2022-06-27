package com.lvl3tasks.tsk18;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent= new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.printMin(4,4);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printMin(4,6);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.printMin(6,4);
        assertEquals("4", outContent.toString());
    }

}