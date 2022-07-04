package com.lvl7task.tsk5;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        HashMap<String, String> map = new HashMap<>(){{
            put("1","asd");
            put("2","assdd");
            put("3","assdfed");
            put("4","afefsd");
            put("5","asasdd");
            put("6","assadefgd");
            put("7","aseged");
            put("8","asasd");
            put("9","asdfe");
            put("10","agersd");
        }};
        Solution.printValues(map);
        assertEquals("asd\n" +
                "assdd\n" +
                "assdfed\n" +
                "afefsd\n" +
                "asasdd\n" +
                "assadefgd\n" +
                "aseged\n" +
                "asasd\n" +
                "asdfe\n" +
                "agersd\n", outContent.toString());
    }
}