package com.lvl7task.tsk9;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long timeOfArr = Solution.getTimeOfInsert(arrayList);
        long timeOfLinked = Solution.getTimeOfInsert(linkedList);
        System.out.print(timeOfLinked < timeOfArr);
        assertEquals("true", outContent.toString());
    }
}