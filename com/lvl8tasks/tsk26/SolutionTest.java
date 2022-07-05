package com.lvl8tasks.tsk26;

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
        ArrayList<int[]> arr = new ArrayList<>(){{
            add(new int[]{1,2,3,4,5});
            add(new int[]{1,2});
            add(new int[]{1,2,3,4});
            add(new int[]{1,2,3,4,5,6,7});
            add(new int[]{});
        }};
        for (var now : arr){
            for (var num : now){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        assertEquals("1 2 3 4 5 \n" +
                "1 2 \n" +
                "1 2 3 4 \n" +
                "1 2 3 4 5 6 7 \n" +
                "\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<int[]> arr = new ArrayList<>(){{
            add(new int[]{4,2,6,4,5});
            add(new int[]{3,2});
            add(new int[]{8,2,6,4});
            add(new int[]{6,2,5,4,8,6,7});
            add(new int[]{});
        }};
        for (var now : arr){
            for (var num : now){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        assertEquals("4 2 6 4 5 \n" +
                "3 2 \n" +
                "8 2 6 4 \n" +
                "6 2 5 4 8 6 7 \n" +
                "\n", outContent.toString());
    }
}