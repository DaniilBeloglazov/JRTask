package com.lvl6tasks.tsk12;

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
            add("asd");
            add("asd");
            add("a");
            add("asd");
            add("asd");
            add("asd");
            add("asddsd");
            add("asd");
            add("asd");
            add("asd");
        }};
        Solution.printMaxOrMin(arr);
        assertEquals("a", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("asd");
            add("a");
            add("asd");
            add("f");
            add("asd");
            add("asddsd");
            add("asd");
            add("asd");
            add("asd");
        }};
        Solution.printMaxOrMin(arr);
        assertEquals("a", outContent.toString());
    }
    @Test
    public void test3(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("bfhfgd");
            add("a");
            add("asd");
            add("f");
            add("asd");
            add("asddsd");
            add("asd");
            add("asd");
            add("asd");
        }};
        Solution.printMaxOrMin(arr);
        assertEquals("bfhfgd", outContent.toString());
    }
}
