package com.lvl9tasks.tsk17;

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
    public void test1() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
        }};
        System.out.print(Solution.safeGetElement(list,5,-1));
        assertEquals("123", outContent.toString());
    }
    @Test
    public void test2() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
            add(123);
        }};
        System.out.print(Solution.safeGetElement(list,20,-1));
        assertEquals("-1", outContent.toString());
    }
}
