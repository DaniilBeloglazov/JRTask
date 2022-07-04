package com.lvl8tasks.tsk3;

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
        System.out.print(Solution.method3());
        assertEquals("18", outContent.toString());
    }
    @Test
    public void test2(){
        System.out.print(Solution.method5());
        assertEquals("23", outContent.toString());
    }
    @Test
    public void test3(){
        System.out.print(Solution.method4());
        assertEquals("28", outContent.toString());
    }
}