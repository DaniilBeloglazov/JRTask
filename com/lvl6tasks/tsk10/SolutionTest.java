package com.lvl6tasks.tsk10;

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
        ArrayList<String> arr = new ArrayList<>(){{
            add("h");
            add("e");
            add("l");
            add("l");
            add("o");
            add("t");
            add("h");
            add("e");
            add("r");
            add("e");
        }};
        Solution.printArrL(arr);
        assertEquals("h\ne\nl\nl\no\nt\nh\ne\nr\ne\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("h");
            add("e");
            add("l");
            add("l");
            add("o");
            add("k");
            add("i");
            add("t");
            add("t");
            add("y");
        }};
        Solution.printArrL(arr);
        assertEquals("h\ne\nl\nl\no\nk\ni\nt\nt\ny\n", outContent.toString());
    }
}