package com.lvl8tasks.tsk27;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Map<String, Solution.Cat> map = Solution.createMap();
        Set<Solution.Cat> set = Solution.convertMapToSet(map);
        Solution.printCatSet(set);
        assertEquals("Cat Cat4\n" +
                "Cat Cat9\n" +
                "Cat Cat7\n" +
                "Cat Cat1\n" +
                "Cat Cat5\n" +
                "Cat Cat6\n" +
                "Cat Cat0\n" +
                "Cat Cat8\n" +
                "Cat Cat3\n" +
                "Cat Cat2\n", outContent.toString());
    }
}