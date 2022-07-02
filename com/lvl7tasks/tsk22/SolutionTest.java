package com.lvl7tasks.tsk22;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(12);
            add(4);
            add(132);
            add(36);
        }};
        int out = Solution.getMinimum(arr);
        System.out.print(out);
        assertEquals("4", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(12);
            add(4);
            add(132);
            add(36);
            add(13);
            add(1);
            add(234);
            add(1234);
        }};
        int out = Solution.getMinimum(arr);
        System.out.print(out);
        assertEquals("1", outContent.toString());
    }
    @Test
    public void test3(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(1);
            add(4);
            add(132);
            add(36);
            add(13);
            add(1);
            add(234);
            add(1234);
        }};
        int out = Solution.getMinimum(arr);
        System.out.print(out);
        assertEquals("1", outContent.toString());
    }
}