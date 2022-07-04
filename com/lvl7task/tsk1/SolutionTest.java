package com.lvl7task.tsk1;

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
        HashSet<String> set = new HashSet<>(){{
            add("арбуз");
            add("банан");
            add("вишня");
            add("груша");
            add("дыня");
            add("ежевика");
            add("жень-шень");
            add("земляника");
            add("ирис");
            add("картофель");
        }};
        Solution.check(set);
        assertEquals("дыня\n" +
                "ежевика\n" +
                "банан\n" +
                "арбуз\n" +
                "груша\n" +
                "картофель\n" +
                "земляника\n" +
                "ирис\n" +
                "вишня\n" +
                "жень-шень\n", outContent.toString());
    }
}