package com.lvl7task.tsk26;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        int[] arr = new int[]{32,1,23,34,21,53,23,45,3,23,4,32,5436,23423,12,43,123,5,3312,53};
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        assertEquals("1\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "12\n", outContent.toString());
    }
    @Test
    public void test2(){
        int[] arr = new int[]{32,12,23,34,231,53,23,425,33,23,24,32,5436,23423,126,43,123,55,3312,533};
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        assertEquals("12\n" +
                "23\n" +
                "23\n" +
                "23\n" +
                "24\n", outContent.toString());
    }
}