package com.lvl4tasks.tsk14;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.Person andr = new Solution.Person();
        andr.initialize("Andrew",22);
        System.out.print(andr.name + " " + andr.age);
        assertEquals("Andrew 22", outContent.toString());
    }
    @Test
    public void test2(){
        Solution.Person alex = new Solution.Person();
        alex.initialize("Alex",17);
        System.out.print(alex.name + " " + alex.age);
        assertEquals("Alex 17", outContent.toString());
    }
    @Test
    public void test3(){
        Solution.Person ann = new Solution.Person();
        ann.initialize("Anna", 30);
        System.out.print(ann.name + " " + ann.age);
        assertEquals("Anna 30", outContent.toString());
    }
}