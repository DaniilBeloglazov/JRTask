package com.lvl7task.tsk16;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        HashMap<String, Date> map = new HashMap<>(){{
            put("Ivanov", new Date(2000,2,2));
            put("Ivanov1", new Date(2000,2,2));
            put("Ivanov2", new Date(2000,3,2));
            put("Ivanov3", new Date(2000,3,2));
            put("Ivanov4", new Date(2000,5,2));
            put("Ivanov5", new Date(2000,6,2));
            put("Ivanov6", new Date(2000,7,1));
            put("Ivanov7", new Date(2000,4,11));
            put("Ivanov8", new Date(2000,3,11));
            put("Ivanov9", new Date(2000,2,11));
        }};
        Solution.deleteWhosSumm(map);
        assertEquals("", outContent.toString());
    }
}