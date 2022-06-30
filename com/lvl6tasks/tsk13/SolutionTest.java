package com.lvl6tasks.tsk13;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(235);
            add(23234);
            add(23123);
            add(233);
            add(2323);
            add(23);
            add(2334);
            add(2345);
            add(2345);
            add(2233);
            add(235463);
            add(2364);
            add(2364);
            add(23342);
            add(234563);
            add(23643);
            add(23366);
            add(2334);
            add(23468);
            add(23987);
        }};
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        ArrayList<Integer> arr3= new ArrayList<>();
        Solution.sortIn3Arr(arr, arr1, arr2, arr3);
        Solution.printList(arr1);
        System.out.println();
        Solution.printList(arr2);
        System.out.println();
        Solution.printList(arr3);
        assertEquals("2334\n" +
                "2364\n" +
                "2364\n" +
                "23643\n" +
                "2334\n" +
                "\n" +
                "23234\n" +
                "2334\n" +
                "2364\n" +
                "2364\n" +
                "23342\n" +
                "23366\n" +
                "2334\n" +
                "23468\n" +
                "\n" +
                "235\n" +
                "23123\n" +
                "233\n" +
                "2323\n" +
                "23\n" +
                "2345\n" +
                "2345\n" +
                "2233\n" +
                "235463\n" +
                "234563\n" +
                "23987\n", outContent.toString());
    }
}
