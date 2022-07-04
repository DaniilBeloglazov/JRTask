package com.lvl7task.tsk18;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Map<String, Integer> map = new HashMap<>(){{
            put("name1", 123);
            put("name2", 1323);
            put("name3", 1423);
            put("name4", 154);
            put("name5", 349);
            put("name6", 1345);
            put("name7", 12334);
            put("name8", 1123);
            put("name9", 523);
            put("name10", 499);
        }};
        Solution.deleteLowerThn500(map);
        assertEquals("name6 1345\n" +
                "name3 1423\n" +
                "name9 523\n" +
                "name8 1123\n" +
                "name7 12334\n" +
                "name2 1323\n", outContent.toString());
    }
}