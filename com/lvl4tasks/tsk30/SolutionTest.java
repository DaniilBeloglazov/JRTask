package com.lvl4tasks.tsk30;

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
    public void test1(){
        Solution.printSumOf2(2,5);
        assertEquals("7", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.printSumOf2(2,0);
        assertEquals("2", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.printSumOf2(2,-5);
        assertEquals("-3", outContent.toString());
    }
}