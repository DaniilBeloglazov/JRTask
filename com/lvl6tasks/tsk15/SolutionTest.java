package com.lvl6tasks.tsk15;

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
        ArrayList<String> arr = new ArrayList<>(){{
            add("Мама");
            add("Мыла");
            add("Раму");
        }};
        Solution.addImenNprint(arr);
        assertEquals("Мама\n" +
                "именно\n" +
                "Мыла\n" +
                "именно\n" +
                "Раму\n", outContent.toString());
    }
}