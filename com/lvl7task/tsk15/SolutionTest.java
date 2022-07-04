package com.lvl7task.tsk15;

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
            put("last1","name1");
            put("last2","name9");
            put("last3","name1");
            put("last4","name3");
            put("last5","name2");
            put("last6","name6");
            put("last7","name5");
            put("last8","name3");
            put("last9","name3");
            put("last10","name2");
        }};
        for (String key : map.keySet()){
            Solution.getCountTheSameFirstName(map, map.get(key));
        }
        assertEquals("Имя name2 встречается 2раз\n" +
                "Имя name3 встречается 3раз\n" +
                "Имя name1 встречается 2раз\n" +
                "Имя name9 встречается 1раз\n" +
                "Имя name1 встречается 2раз\n" +
                "Имя name3 встречается 3раз\n" +
                "Имя name3 встречается 3раз\n" +
                "Имя name2 встречается 2раз\n" +
                "Имя name5 встречается 1раз\n" +
                "Имя name6 встречается 1раз\n", outContent.toString());
    }
}