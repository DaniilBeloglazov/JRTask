package com.lvl6tasks.tsk20;

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
        int m = 3;
        ArrayList<String> arr = new ArrayList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        Solution.printSwapMStringsToEnd(arr, m);
        assertEquals("d\ne\na\nb\nc\n", outContent.toString());
    }
    @Test
    public void test2(){
        int m = 5;
        ArrayList<String> arr = new ArrayList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        Solution.printSwapMStringsToEnd(arr, m);
        assertEquals("a\nb\nc\nd\ne\n", outContent.toString());
    }
    @Test
    public void test3(){
        int m = 0;
        ArrayList<String> arr = new ArrayList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        Solution.printSwapMStringsToEnd(arr, m);
        assertEquals("a\nb\nc\nd\ne\n", outContent.toString());
    }
}