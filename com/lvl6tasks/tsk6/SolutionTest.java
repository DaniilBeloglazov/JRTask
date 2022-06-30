package com.lvl6tasks.tsk6;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Solution.whereMoreCitizen(arr);
        assertEquals("В домах с четными номерами проживает больше жителей.", outContent.toString());
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,1,1,1,1,1,1,1,1,1,1,1,1,0};
        Solution.whereMoreCitizen(arr);
        assertEquals("В домах с нечетными номерами проживает больше жителей.", outContent.toString());
    }
}