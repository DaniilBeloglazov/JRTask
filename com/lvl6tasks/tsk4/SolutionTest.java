package com.lvl6tasks.tsk4;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

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
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);

        }};
        Collections.reverse(arr);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(5);
            add(4);
            add(3);
            add(2);
            add(1);

        }};
        Collections.reverse(arr);
        for (var now : arr){
            System.out.println(now);
        }
        assertEquals("1\n2\n3\n4\n5\n5\n4\n3\n2\n1\n", outContent.toString());
    }
}