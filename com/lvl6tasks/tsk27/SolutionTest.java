package com.lvl6tasks.tsk27;

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
            add("as");
            add("asd");
            add("as");
            add("asdfg");
        }};
        Solution.printConverted(arr);
        assertEquals("as as\n" +
                "asd asd asd\n" +
                "as as\n" +
                "asdfg asdfg asdfg\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("asd");
            add("asd");
            add("as");
            add("asdfg");
        }};
        Solution.printConverted(arr);
        assertEquals("asd asd asd\n" +
                "asd asd asd\n" +
                "as as\n" +
                "asdfg asdfg asdfg\n", outContent.toString());
    }
    @Test
    public void test3(){
        ArrayList<String> arr = new ArrayList<>(){{
            add("as");
        }};
        Solution.printConverted(arr);
        assertEquals("as as\n", outContent.toString());
    }
}