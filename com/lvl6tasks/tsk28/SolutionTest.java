package com.lvl6tasks.tsk28;

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
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);
            add(223);
            add(223);
            add(234522);
            add(232145);
            add(2132);
            add(24532);
            add(5672);
            add(267);
            add(562);
            add(2567);
            add(76542);
            add(4572);
            add(43572);
            add(24);
            add(452);
            add(245);
            add(322);
            add(253);
            add(632);
        }};
        Solution.printInDecrease(arr);
        assertEquals("234522\n" +
                "232145\n" +
                "76542\n" +
                "43572\n" +
                "24532\n" +
                "5672\n" +
                "4572\n" +
                "2567\n" +
                "2132\n" +
                "632\n" +
                "562\n" +
                "452\n" +
                "322\n" +
                "267\n" +
                "253\n" +
                "245\n" +
                "223\n" +
                "223\n" +
                "24\n" +
                "2\n", outContent.toString());
    }
    @Test
    public void test2(){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);
            add(223);
            add(2233);
            add(234522);
            add(232145);
            add(2132);
            add(22454532);
            add(56372);
            add(267);
            add(5642234);
            add(2567);
            add(765342);
            add(4572);
            add(432572);
            add(24);
            add(452);
            add(24235);
            add(322);
            add(24353);
            add(632);
        }};
        Solution.printInDecrease(arr);
        assertEquals("22454532\n" +
                "5642234\n" +
                "765342\n" +
                "432572\n" +
                "234522\n" +
                "232145\n" +
                "56372\n" +
                "24353\n" +
                "24235\n" +
                "4572\n" +
                "2567\n" +
                "2233\n" +
                "2132\n" +
                "632\n" +
                "452\n" +
                "322\n" +
                "267\n" +
                "223\n" +
                "24\n" +
                "2\n", outContent.toString());
    }
}