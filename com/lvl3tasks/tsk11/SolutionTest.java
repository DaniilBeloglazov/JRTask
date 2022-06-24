package com.lvl3tasks.tsk11;

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
        Solution.checkSeason(7);
        assertEquals("Summer", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.checkSeason(12);
        assertEquals("Winter", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.checkSeason(3);
        assertEquals("Spring", outContent.toString());
    }
    @Test
    public void test4(){
        Solution.checkSeason(10);
        assertEquals("Fall", outContent.toString());
    }
}