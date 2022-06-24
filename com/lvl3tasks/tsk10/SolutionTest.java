package com.lvl3tasks.tsk10;

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
        Solution.checkInterval(50);
        assertEquals("Число 50 содержится в интервале.", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.checkInterval(49);
        assertEquals("Число 49 не содержится в интервале.", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.checkInterval(101);
        assertEquals("Число 101 не содержится в интервале.", outContent.toString());
    }
    @Test
    public void test4(){
        Solution.checkInterval(100);
        assertEquals("Число 100 содержится в интервале.", outContent.toString());
    }
}