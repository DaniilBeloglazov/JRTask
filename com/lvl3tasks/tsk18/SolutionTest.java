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
        System.out.print(Math.min(4, 4));
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(Math.min(4, 6));
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(Math.min(6, 4));
        assertEquals("4", outContent.toString());
    }

}