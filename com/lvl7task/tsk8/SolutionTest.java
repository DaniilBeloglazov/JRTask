package com.lvl7task.tsk8;

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
        Solution.insert10000(arrayList);
        Solution.get10000(arrayList);
        Solution.set10000(arrayList);
        Solution.remove10000(arrayList);
        LinkedList linkedList = new LinkedList();
        Solution.insert10000(linkedList);
        Solution.get10000(linkedList);
        Solution.set10000(linkedList);
        Solution.remove10000(linkedList);
        System.out.print(linkedList + " " +arrayList);
        assertEquals("[] []", outContent.toString());
    }
}