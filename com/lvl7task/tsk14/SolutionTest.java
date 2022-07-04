package com.lvl7task.tsk14;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        HashSet<Integer> set = new HashSet<>(){{
            add(12);
            add(2);
            add(3);
            add(2);
            add(3);
            add(43);
            add(32);
            add(9);
            add(23);
            add(2);
            add(1);
            add(4);
            add(5);
            add(6);
            add(8);
            add(9);
            add(2);
            add(43);
            add(56);
            add(7);
        }};
        Solution.deleteGreaterTh10(set);
        System.out.print(set);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", outContent.toString());
    }
}