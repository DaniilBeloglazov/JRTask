package com.lvl4tasks.tsk7;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Vector;

import static org.junit.Assert.*;


public class SolutionTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Vector<Integer> inp = new Vector<>(){{
            add(6);
            add(3);
            add(1);
            add(4);
            add(5);
        }};
        Solution.printAverage(inp);
        assertEquals("3.8", outContent.toString());
    }
    @Test
    public void test2(){
        Vector<Integer> inp = new Vector<>(){{
            add(1);
            add(5);
            add(5);
            add(6);
            add(4);
        }};
        Solution.printAverage(inp);
        assertEquals("4.2", outContent.toString());
    }
    @Test
    public void test3(){
        Vector<Integer> inp = new Vector<>(){{
            add(1);
        }};
        Solution.printAverage(inp);
        assertEquals("1.0", outContent.toString());
    }
}